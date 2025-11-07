/**
This is a calculator program and uses javafx to run, please make sure that have install javafx to use this program.
@author Reilly Green - piadv
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculator extends Application {
    
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button add;
    private Button sub;
    private Button mult;
    private Button div;
    private Button mod;
    private Button equal;

    private Text answer;
    private Text equation;


    public void start (Stage primaryStage) {
            primaryStage.setTitle("Calculator");

            // buttons
            b7 = new Button("7");
            b4 = new Button("4");
            b1 = new Button("1");

            b8 = new Button("8");
            b5 = new Button("5");
            b2 = new Button("2");

            b9 = new Button("9");
            b6 = new Button("6");
            b3 = new Button("3");

            b0 = new Button("0");

            add = new Button("+");
            sub = new Button("-");
            mult = new Button("x");
            div = new Button("/");
            mod = new Button("%");

            equal = new Button("=");

            // TextField input = new TextField();

            answer = new Text("Answer: ");
            equation = new Text("Equation");

            // input.setPrefWidth(200);
            // input.setPrefHeight(200);

            b1.setPrefWidth(50);b2.setPrefWidth(50);b3.setPrefWidth(50);
            b4.setPrefWidth(50);b5.setPrefWidth(50);b6.setPrefWidth(50);
            b7.setPrefWidth(50);b8.setPrefWidth(50);b9.setPrefWidth(50);
            b0.setPrefWidth(50);
            
            add.setPrefWidth(50);sub.setPrefWidth(50);mult.setPrefWidth(50);
            div.setPrefWidth(50);mod.setPrefWidth(50);equal.setPrefWidth(50);
            
            b1.setOnAction(this::buttonPress);
            
            // panes
            
            GridPane gridPane = new GridPane();

            FlowPane answerPane = new FlowPane(answer);
            FlowPane equationPane = new FlowPane(equation);
            // gridPane.setGridLinesVisible(true);

            gridPane.getColumnConstraints().add(new ColumnConstraints(50));
            gridPane.getColumnConstraints().add(new ColumnConstraints(50));
            gridPane.getColumnConstraints().add(new ColumnConstraints(50));
            gridPane.getColumnConstraints().add(new ColumnConstraints(50));
            
            gridPane.getRowConstraints().add(new RowConstraints(50));
            gridPane.getRowConstraints().add(new RowConstraints(25));
            gridPane.getRowConstraints().add(new RowConstraints(25));
            gridPane.getRowConstraints().add(new RowConstraints(25));
            gridPane.getRowConstraints().add(new RowConstraints(25));
            gridPane.getRowConstraints().add(new RowConstraints(25));
            gridPane.getRowConstraints().add(new RowConstraints(25));

            gridPane.add(b1, 0, 5);gridPane.add(b2, 1, 5);gridPane.add(b3, 2, 5);
            gridPane.add(b4, 0, 4);gridPane.add(b5, 1, 4);gridPane.add(b6, 2, 4);
            gridPane.add(b7, 0, 3);gridPane.add(b8, 1, 3);gridPane.add(b9, 2, 3);
            gridPane.add(b0, 2, 6);

            gridPane.add(add, 3, 3);gridPane.add(sub, 3, 4);gridPane.add(mult, 3, 5);
            gridPane.add(div, 0, 6);gridPane.add(mod, 1, 6);gridPane.add(equal, 3, 6);
            
            // gridPane.add(input, 0, 1, 4, 1);
            
            
            answerPane.setAlignment(Pos.CENTER);
            answerPane.setVgap(30);
            answerPane.setHgap(30);

            equationPane.setAlignment(Pos.CENTER);
            equationPane.setVgap(30);
            equationPane.setHgap(30);

            gridPane.add(answerPane, 0, 0, 4, 1);
            gridPane.add(equationPane, 0, 1, 4, 2);

            // scenes
            Scene scene = new Scene (gridPane, 200, 200);

            primaryStage.setScene(scene);
            primaryStage.show();
    }

    public void buttonPress (ActionEvent event) {

    
    }

    
}