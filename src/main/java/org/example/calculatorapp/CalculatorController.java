package org.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
        @FXML// The Calculator instance representing the model (logic handler)
        Calculator calc = new Calculator();
        @FXML // The TextField for displaying numbers and results in the UI
        private TextField text;

        @FXML // When button '1' is clicked, this method appends '1' to the current text in the TextField
        private void onClick1 () {
            String val = text.getText();
            val = val + "1";
            text.setText(val);
        }
        @FXML//// When button '2' is clicked, this method appends '2' to the current text in the TextField
        private void onClick2 () {
            String val = text.getText();
            val = val + "2";
            text.setText(val);

        }
        @FXML // When button '2' is clicked, this method appends '2' to the current text in the TextField
        private void onClick3 () {
            String val = text.getText();
            val = val + "3";
            text.setText(val);
        }
        @FXML// When button '4' is clicked, this method appends '4' to the current text in the TextField
        private void onClick4 () {
            String val = text.getText();
            val = val + "4";
            text.setText(val);
        }
        @FXML // When button '5' is clicked, this method appends '5' to the current text in the TextField
        private void onClick5 () {
            String val = text.getText();
            val = val + "5";
            text.setText(val);
        }
        @FXML // When button '6' is clicked, this method appends '6' to the current text in the TextField
        private void onClick6 () {
            String val = text.getText();
            val = val + "6";
            text.setText(val);
        }
        @FXML// When button '7' is clicked, this method appends '7' to the current text in the TextField
        private void onClick7() {
            String val = text.getText();
            val = val + "7";
            text.setText(val);
        }
        @FXML // When button '8' is clicked, this method appends '8' to the current text in the TextField
        private void onClick8 () {
            String val = text.getText();
            val = val + "8";
            text.setText(val);
        }
        @FXML// When button '9' is clicked, this method appends '9' to the current text in the TextField
        private void onClick9 () {
            String val = text.getText();
            val = val + "9";
            text.setText(val);
        }
        @FXML // When button '0' is clicked, this method appends '0' to the current text in the TextField
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
        @FXML // When the '+' operator is clicked, the current value is set as operand1, and operator is set to '+'
        private void onMinusClick () {
            String operand1 = text.getText();
            text.setText("");
            calc.setOperand1(Integer.parseInt(operand1));
            calc.setOperator('-');
        }
        @FXML //operator is set to '*'
        private void onMultiplicationClick () {
            String operand1 = text.getText();
            text.setText("");
            calc.setOperand1(Integer.parseInt(operand1));
            calc.setOperator('*');
        }
        @FXML//operator is set to '/'
        private void onDivisionClick () {
            String operand1 = text.getText();
            text.setText("");
            calc.setOperand1(Integer.parseInt(operand1));
            calc.setOperator('/');
    }
        @FXML // When the '=' button is clicked, it performs the calculation and displays the result
        private void onEqualClick () {
            if (calc.isError()){//isError is true when operator:'=', opperand2=0(we cant divide a digit into 0)
                text.setText("not possible to calculate");
            } else {
                // Otherwise, display the valid result
                String op2 = text.getText();
                calc.setOperand2(Integer.parseInt(op2));
                calc.calculate();
                text.setText("" + calc.getResult());
            }
        }
        @FXML//resets all fields and clears the textField
        private void onClearClick (){
            text.setText("");
            calc.reset();
        }



}