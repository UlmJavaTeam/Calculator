
public class Main {
    public static void main(String[] args) {
        //-- Kenan abinin

        CalculatorInterface calculator = new Calculator();
        System.out.println("Wellcome to Calculator");
        boolean control = true;
        while (control) {
            System.out.println("1. add");
            System.out.println("2. subtract");
            System.out.println("3. multiply");
            System.out.println("4 divide");
            System.out.println("5 square");
            System.out.println("6 squareroot");
            System.out.println("7 divide to one");
            System.out.println("8. exit!!");
            int number = calculator.enterNumber();
            switch (number) {
                case 1:
                    calculator.add(calculator.enterNumber(), calculator.enterNumber());
                    break;
                case 2:
                    calculator.subtract(calculator.enterNumber(), calculator.enterNumber());
                    break;
                case 3:
                    calculator.multply(calculator.enterNumber(), calculator.enterNumber());
                    break;
                case 4:
                    calculator.divide(calculator.enterNumber(), calculator.enterNumber());
                    break;
                case 5:
                    calculator.square(calculator.enterNumber());
                    break;
                case 6:
                    calculator.squareRoot(calculator.enterNumber());
                    break;
                case 7:
                    calculator.divideOne(calculator.enterNumber());
                    break;
                case 8:
                    control = false;
                    break;
                default:
                    System.out.println("wrong number!!");
            }
        }
    }
}
