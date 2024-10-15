package org.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
        Calculator calc = new Calculator();
        @FXML
        private TextField text;

        @FXML
        private void onClick1 () {
            String val = text.getText();
            val = val + "1";
            text.setText(val);
        }
        @FXML
        private void onClick2 () {
            String val = text.getText();
            val = val + "2";
            text.setText(val);

        }
        @FXML
        private void onClick3 () {
            String val = text.getText();
            val = val + "3";
            text.setText(val);
        }
        @FXML
        private void onClick4 () {
            String val = text.getText();
            val = val + "4";
            text.setText(val);
        }
        @FXML
        private void onClick5 () {
            String val = text.getText();
            val = val + "5";
            text.setText(val);
        }
        @FXML
        private void onClick6 () {
            String val = text.getText();
            val = val + "6";
            text.setText(val);
        }
        @FXML
        private void onClick7() {
            String val = text.getText();
            val = val + "7";
            text.setText(val);
        }
        @FXML
        private void onClick8 () {
            String val = text.getText();
            val = val + "8";
            text.setText(val);
        }
        @FXML
        private void onClick9 () {
            String val = text.getText();
            val = val + "9";
            text.setText(val);
        }
        @FXML
        private void onClick0 () {
            String val = text.getText();
            val = val + "0";
            text.setText(val);
         }
        @FXML
        private void onPlusClick () {
            String operand1 = text.getText();
            text.setText("");
            calc.setOperand1(Integer.parseInt(operand1));
            calc.setOperator('+');
        }
        @FXML
        private void onMinusClick () {
            String operand1 = text.getText();
            text.setText("");
            calc.setOperand1(Integer.parseInt(operand1));
            calc.setOperator('-');
        }
        @FXML
        private void onMultiplicationClick () {
            String operand1 = text.getText();
            text.setText("");
            calc.setOperand1(Integer.parseInt(operand1));
            calc.setOperator('*');
        }
        @FXML
        private void onDivisionClick () {
            String operand1 = text.getText();
            text.setText("");
            calc.setOperand1(Integer.parseInt(operand1));
            calc.setOperator('/');
    }
        @FXML
        private void onEqualClick () {

            String op2 = text.getText();
            calc.setOperand2(Integer.parseInt(op2));
            calc.calculate();
            text.setText("" + calc.getResult());

        }
        @FXML
        private void onClearClick () {
            text.setText("");
        }



}