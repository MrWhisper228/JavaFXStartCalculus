package com.calcul.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculationController {
    public Button calculation;
    public Label info;
    @FXML
    TextField Statement;


    @FXML
    Label result;
    

    @FXML
    void onResultButtonClick() {
       result.setText(Calculation.calculation(Statement.getText()));

    }


}