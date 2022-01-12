package introexceptiontrycatchtrace;

public class Calculator {

    public int Calculate(int first, int second, String task) {
        int result = 0;
        try {
            switch (task) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "/":
                    result = first / second;
                    break;
                case "*":
                    result = first * second;
                    break;
                default:
                    System.out.println("Hibás művelet!");
            }

            } catch(ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
            return result;
        }


    }
