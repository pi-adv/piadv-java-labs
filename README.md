# piadv-java-labs
![Java](https://img.shields.io/badge/Java-17-orange)
![JavaFX](https://img.shields.io/badge/JavaFX-Enabled-blue)
<p align="center"> A side project that test and shows different java and javafx applications. Apps based on day-to-day tasks. 🚀 </p>

---
Repo workflow:

- [ ] First Build
- [ ] Beta Upload
- [ ] Testing/Troubleshooting
- [ ] Main release (v-__)
---
|App|Beta|Testing|Main Release|Recent Version|
|--------|----|---------------|------------|--------------|
|Calculator|✔️|In Progress|❌|❌|
|Text Editor|✔️|In Progress|❌|❌|
|More Soon...|
---
# Installing Javafx
Javafx requires a long command to compile your java files and also run them. In this project I have provided files and a mini tutorial to setup shortcuts for javafx.

*This tutorial covers the installation from <a href="https://gluonhq.com/products/javafx/" target="_blank">openjfx.io</a> on Windows.

## Requirements:
- Downloaded the Javafx zip folder.
- Admin privileges
- Powershell/Command Prompt

1. Unzip the javafx.zip folder. (7zip or Windows extract)
2. Move the internal folder (javafx-sdk-21.0.4) into a preferred folder on your drive. (Keep a note on where and what you called this folder)
3. Download the release for the two .cmd files. ([ java-fx ](https://github.com/pi-adv/piadv-java-labs/releases/download/javafx-tutorial/java-fx.cmd)) ([ javac-fx ](https://github.com/pi-adv/piadv-java-labs/releases/download/javafx-tutorial/javac-fx.cmd)) (<a href="https://github.com/pi-adv/piadv-java-labs/releases/tag/javafx-tutorial" target="_blank"> Release </a>)
4. Place the two files in the javafx folder. (Preferably in a new folder inside of javafx)
5. Open both files in a text editor of your choice.
   a. Modify the end of the line of BOTH files and change `C:\javafx\lib\` to `C:_pathtojavafx_\lib`.
6. Open your environment variables. (Search --> Environment Variables --> Environment Variables --> (Bottom Window) Path --> Add)
7. Add a new path that points to the folder that has the .cmd files.
8. Restart any Powershell/Command Prompt windows.
9. Run javafx programs!

## Utilization:

javac-fx _file.java_  --> compiles javafx programs

java-fx _file_  --> runs javafx programs

---

Thanks for checking out my project!
