public class Calulator {
    
    public static void main(String[] args) {

        double num1 = 10.5;
        double num2 = 5.0;
        char operator = '/';

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
                
            case '/':

                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
                
            default:
                System.out.println("Invalid operator.");
                break;
        }
    }
}
