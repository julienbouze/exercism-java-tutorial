class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int number = 0;   
        if (operation=="+"){
            number = operand1 + operand2; 
        }else if (operation=="*"){
            number = operand1 * operand2;
        }else if (operation=="/"){
            try{
                number = operand1 / operand2;
            }catch(ArithmeticException ae){
                throw new IllegalOperationException("Division by zero is not allowed" , ae);
            }       
        }else if (operation==null){
            throw new IllegalArgumentException("Operation cannot be null");
        }else if (operation==""){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        else {
            throw new IllegalOperationException("Operation '" + operation +"' does not exist");
        }   
        String result = Integer.toString(operand1) + " " + operation + " " + Integer.toString(operand2) + " = " + Integer.toString(number);
        return result;
    }
}
