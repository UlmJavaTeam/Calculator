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

        return a + b;
    }

    @Override
    public int subtract(int a, int b) {

        return a - b;
    }

    @Override
    public int multply(int a, int b) {

        return a * b;
    }

    @Override
    public double divide(int a, int b) {

        return (double) a / b;
    }

    @Override
    public int square(int a) {

        return a * a;
    }

    @Override
    public double squareRoot(int a) {

        return (double) Math.sqrt(a);
    }

    @Override
    public double divideOne(int a) {

        return (double) 1 / a;
    }

    public int enternumber(){
        int number=0;
        System.out.println("Please enter a number: ");
        while (true){
            try{
                number= scan.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Please enter a number!!!");
            }
        }
        return number;
    }

}
