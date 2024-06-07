package com.org.fx.hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Controls
        Button button = new Button("Click Me !");
        Button button1 = new Button("Click Me Again !");

        // Adding Labels
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\shaja\\My Documents\\sample\\HelloFx\\src\\windows-media-player.png");
        Image image = new Image(fileInputStream);
        ImageView imageView = new ImageView(image);
        Label label = new Label("I am learning JAVA FX");
        label.setWrapText(true);

        // Radio Buttons
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton radioButton = new RadioButton("English");
        RadioButton radioButton1 = new RadioButton("Physics");
        RadioButton radioButton2 = new RadioButton("Chemistry");
        radioButton.setToggleGroup(toggleGroup);
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        // CheckBoxes
        CheckBox checkBox = new CheckBox("Sanskrit");
        CheckBox checkBox1 = new CheckBox("Telugu");

        // TextField and Password Field
        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();
        VBox vbox2 = new VBox(textField, passwordField);

        // Menu Bar
        MenuBar mainMenu = new MenuBar();
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        Menu navigate = new Menu("Navigate");
        Menu shaik = new Menu("Shaik");
        mainMenu.getMenus().addAll(file, edit, view, navigate,shaik);
        // Menu items
        MenuItem New = new MenuItem("New");
        MenuItem open = new MenuItem("open");
        MenuItem saveas = new MenuItem("saveAs");
        file.getItems().addAll(New, open, saveas);
        MenuItem cut = new MenuItem("cut");
        MenuItem copy = new MenuItem("copy");
        MenuItem paste = new MenuItem("paste");
        MenuItem tools = new MenuItem("tools");
        MenuItem windows = new MenuItem("windows");
        MenuItem run = new MenuItem("run");
        //SubMenus for New
        Menu shajahan = new Menu("shajahan");
        MenuItem zyx = new MenuItem("xyz");
        shajahan.getItems().add(zyx);
        shaik.getItems().add(shajahan);
        edit.getItems().addAll(cut,copy, paste);
        view.getItems().addAll(tools,windows,run);
        //DatePicker
        DatePicker datePicker = new DatePicker();
        Label label1 = new Label("Please select a date");
        HBox hBox3 = new HBox(label1, datePicker);
        // Layouts
        HBox hbox = new HBox(button, label);
        VBox vbox = new VBox(radioButton1, radioButton2, radioButton, checkBox1, checkBox);

        // BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(mainMenu); // Setting the menu bar at the top
        borderPane.setLeft(vbox);    // Setting the VBox on the left
        borderPane.setCenter(hbox);  // Setting the HBox in the center
        borderPane.setBottom(vbox2); // Optional: Setting the VBox with TextField and PasswordField at the bottom
        borderPane.setCenter(hBox3);
        // Scene
        Scene scene = new Scene(borderPane, 420, 420, Color.GREEN);

        // Stage
        stage.setScene(scene);
        stage.getIcons().add(image);
        stage.setResizable(false);
        stage.setTitle("Application.exe");
        stage.show();
    }
}
