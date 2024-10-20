package org.example.calculatorapp;
public class Calculator {
    private double operand1;// Stores the first operand
    private double operand2;// Stores the second operand
    private char operator;// Stores the arithmetic operator
    private  double result;// Stores the result of the operation
    public boolean isError()// Returns true if an error occurred (division by zero)
    {
        if(operator=='/' && operand2==0){
            return true;
        }
        else {return false;}
    }
    public void reset()// Resets all fields (for a new calculation)
    {
        operand1 = 0;
        operand2 = 0;
        operator = '\0';// No operator
        result = 0;
        boolean isError = false;
    }

    public void calculate()/* Performs the calculation based on the operator*/{

        if(this.operator == '+'){
            this.result = operand1 + operand2;
        }
        else if(this.operator == '-'){this.result = operand1 - operand2;
        }
        else if(this.operator == '*'){this.result = operand1 * operand2;
        }
        else if(this.operator == '/' && operand2!=0 && !isError()){this.result = operand1 / operand2;
        }
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }
    //setter methods
    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }
    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }
    public void setResult(int result) {
        this.result = result;
    }
    //getter methods
    public double getOperand1() {
        return operand1;
    }
    public double getOperand2() {
        return operand2;
    }
    public char getOperator() {
        return operator;
    }
    public double getResult() {
        return result;
    }

}
