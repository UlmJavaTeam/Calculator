import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //-- Kenan abinin

        CalculatorInterface calculator= new Calculator();
        System.out.println("Wellcome to Calculator");
        while (true){
            System.out.println("1. add");
            System.out.println("2. subtract");
            System.out.println("3. multiply");
            System.out.println("4 divide");
            System.out.println("5 square");
            System.out.println("6 squareroot");
            System.out.println("7 divide to one");
            System.out.println("8. exit!!");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            switch (number) {
                case 1:
                    calculator.add(input.nextInt(), input.nextInt());
                            break;
                case 2:
                    calculator.subtract(input.nextInt(), input.nextInt());
                    break;
                case 3:
                    calculator.multply(input.nextInt(), input.nextInt());
                    break;
                case 4:
                    calculator.divide(input.nextInt(), input.nextInt());
                    break;
                case 5 :
                    calculator.square(input.nextInt());
                    break;
                case 6 :
                    calculator.squareRoot(input.nextInt());
                    break;
                case 7 :
                    calculator.divideOne(input.nextInt());
                case 8:
                    break;//burada break döngüyü nasıl kırıyor??
                default:
                    System.out.println("wrong number!!");
                    continue;
            }








            break;
        }





        calculator.add(3, 5);



    }
}
