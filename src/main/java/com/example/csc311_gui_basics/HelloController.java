package com.example.csc311_gui_basics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label whereLabel;

    @FXML
    private Label whenLabel;

    @FXML
    private Button invertButton;

    @FXML
    protected void onRotateClick() {
        whereLabel.setRotate(180.0);
        whenLabel.setRotate(180.0);
        }


    @FXML
    protected void onWhereButtonClicked(){
        whereLabel.setText("Museum of Modern Art");
        whenLabel.setText("09/01/2023");
    }







}