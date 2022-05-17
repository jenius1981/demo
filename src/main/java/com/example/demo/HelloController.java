//package com.example.demo;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//
//public class HelloController {
//
//    @FXML
//    private ResourceBundle resources;
//
//    @FXML
//    private URL location;
//
//    @FXML
//    private Label helloLable;
//
//    @FXML
//    private TextField nameField;
//
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    void helloBtn(ActionEvent event) {
//      String name =  nameField.getText();
//      helloLable.setText("Привет: " + name);
//    }
//
//    @FXML
//    void initialize() {
//        assert helloLable != null : "fx:id=\"helloLable\" was not injected: check your FXML file 'hello-view.fxml'.";
//        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'hello-view.fxml'.";
//        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'hello-view.fxml'.";
//
//    }
//
//}
package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label helloLable;

    @FXML
    private Label minusPlusAnswer;

    @FXML
    private TextField minusPlusField;

    @FXML
    private TextField nameField;

    @FXML
    private Label welcomeText;

    @FXML
    void helloBtn(ActionEvent event) {
        String name =  nameField.getText();
        helloLable.setText("Привет: " + name);
    }

    @FXML
    void minusTwo(ActionEvent event) {

    }

    @FXML
    void plusTwo(ActionEvent event) {

    }



    @FXML
    void initialize() {
        assert helloLable != null : "fx:id=\"helloLable\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert minusPlusAnswer != null : "fx:id=\"minusPlusAnswer\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert minusPlusField != null : "fx:id=\"minusPlusField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
