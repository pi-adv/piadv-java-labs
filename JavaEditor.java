/**
This program is design to be a text editor with a save, load function
@author Reilly Green - piadv
*/

// Another note, the -> (Arrow operator) separates the parameters from the
// implementation. This is mainly used in for the save and open function.
// It's supposed to replace the use of (this::processButtonPress) and to solve
// any scope issues.

// Apart of the fileChooser I also use the try and catch keywords stated in the docs.oracle 
// section for ui's, https://docs.oracle.com/javafx/2/ui_controls/file-chooser.htm 

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleButton;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class JavaEditor extends Application {
        
    public void start (Stage primaryStage) {
        primaryStage.setTitle("Java Editor");

        // components
        Font font = new Font("Courier New", 14);
        TextArea writingSpace = new TextArea();
        writingSpace.setFont(font);

        Button bNew = new Button("New");
        Button bOpen = new Button("Open");
        Button bSave = new Button("Save");

        LocalDateTime rightNow = LocalDateTime.now();
        Text date = new Text(rightNow.getYear() + "-" + rightNow.getMonth() + "-" + rightNow.getDayOfMonth());

        ToolBar topBar = new ToolBar(bNew, bOpen, bSave, new Separator()); // to add bCurrent
        ToolBar bottomBar = new ToolBar(date);

        bNew.setOnAction(event -> {
            primaryStage.setTitle("Java Editor");
            writingSpace.clear();
        });

        bSave.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter extenFilter = new FileChooser.ExtensionFilter("java files", "*.java");
            fileChooser.getExtensionFilters().add(extenFilter);

            File file = fileChooser.showSaveDialog(primaryStage);

            if (file != null) {
                try (BufferedWriter stdWrite = new BufferedWriter(new FileWriter(file, true))) {
                    stdWrite.write(writingSpace.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }  
        });

        bOpen.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter extenFilter = new FileChooser.ExtensionFilter("java files", "*.java");
            fileChooser.getExtensionFilters().add(extenFilter);

            File file = fileChooser.showOpenDialog(primaryStage);
            
            if (file != null) {
                try (BufferedReader stdRead = new BufferedReader(new FileReader(file))) {
                    writingSpace.clear();
                    String line;
                    while ((line = stdRead.readLine()) != null) {
                        writingSpace.appendText(line + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            primaryStage.setTitle("Java Editor - " + file.getName());
        });
        
        // pane
        BorderPane pane = new BorderPane();

        pane.setPrefSize(1250, 750);
        pane.setTop(topBar);
        pane.setBottom(bottomBar);
        pane.setCenter(writingSpace);

        // scene
        Scene scene = new Scene(pane, 1250, 750);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
