import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator implements CalculatorInterface {
    // Murat abinin

    private Scanner scan;

    public Calculator() {
        this.scan = new Scanner(System.in);
    }

    @Override
    public int add(int a, int b) {
        System.out.println("Result: "+ a+" + "+b+"= "+ (a+b));
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println("Result: "+ a+" - "+b+"= "+ (a-b));
        return a - b;
    }

    @Override
    public int multply(int a, int b) {
        System.out.println("Result: "+ a+" * "+b+"= "+ (a*b));
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        System.out.println("Result: "+ a+" / "+b+"= "+ ((double)a/b));
        return (double) a / b;
    }

    @Override
    public int square(int a) {
        System.out.println("Result: "+ a+" * "+a+"= "+ (a*a));
        return a * a;
    }

    @Override
    public double squareRoot(int a) {
        System.out.println("Result: V"+a+"= "+ Math.sqrt(a));
        return Math.sqrt(a);
    }

    @Override
    public double divideOne(int a) {
        System.out.println("Result: 1/"+a+"="+(double)1/a);
        return (double) 1 / a;
    }

    public int enterNumber(){
        int number=0;
        System.out.println("Please enter a number: ");
        while (true){
            try{
                Scanner input= new Scanner(System.in);
                number= input.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Invalid input!! Please enter a number!!!");
            }
        }
        return number;
    }

}