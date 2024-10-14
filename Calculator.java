public class Calculator {
    private double operand1;   // Stores the first operand
    private double operand2;   // Stores the second operand
    private char operator;     // Stores the arithmetic operator
    private  double result;     // Stores the result of the operation
    private boolean isError;   // Tracks if an error occurred (e.g., division by zero)

    public double getResult();                  // Returns the result of the operation
    public boolean isError();                   // Returns true if an error occurred (e.g., division by zero)
    public void reset();                        // Resets all fields (for a new calculation)
    public void calculate(){
        if(this.operator == '+'){
            this.result = operand1 + operand2;
        }
        else if(this.operator == '-'){this.result = operand1 - operand2;
        }
        else if(this.operator == '*'){this.result = operand1 * operand2;
        }
        else if(this.operator == '/' && operand2!=0 ){this.result = operand1 / operand2;
         }
    };                    // Performs the calculation based on the operator
    public void setOperator(char operator) {
        this.operator = operator;
    }
    public char getOperator() {
        return operator;
    }
    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getOperand1() {
        return operand1;
    }
    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
}
