import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an operation you want to perform");
        System.out.println("1-add");
        System.out.println("2-subtract");
        System.out.println("3-multiply");
        System.out.println("4-power");
        
        int operation = scanner.nextInt();

        System.out.print("Enter first value ");
        double firstVal = scanner.nextDouble();

        System.out.print("Enter second value ");
        double secondVal = scanner.nextDouble();

        switch(operation) {
            case 1:
                add(firstVal, secondVal);
                break;
            case 2:
                sub(firstVal, secondVal);
                break;
            case 3:
                mul(firstVal, secondVal);
                break;
            case 4:
                power(firstVal, secondVal);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }

    static void add(double val1, double val2){
        System.out.println("Answer = " + (val1 + val2));
    }

    static void sub(double val1, double val2){
        System.out.println("Answer = " + (val1 - val2));
    }

    static void mul(double val1, double val2){
        System.out.println("Answer = " + (val1 * val2));
    }

    static void power(double val1, double val2){
//<<<<<<< HEAD
//        long result = val1;
//
//        for (int i = 1; i < val2; i++) {
//            result = result * val1;                 // User B
//        }
//        System.out.println("Answer = " + result)
//=======
        System.out.println("Answer = " + Math.pow(val1, val2)) // User A
//>>>>>>> a99675002ec2260eba6fdeb7cbd56e80e538b2c6
    }
}
