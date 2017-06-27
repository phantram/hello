import java.util.Scanner;

/**
 * ChatBot Program
 */
public class ChatBotProgram {
    public static void main(String... args) {

        System.out.println(cube(1024));

        int num2 = 3;
        printSquare(num2);

        System.out.println(num2);
    }

    public static int cube(int i) {
        int myPrivateVar = i * i * i;
        return myPrivateVar;
    }

    public static void printSquare(int x) {
        System.out.println(x);
        x = x * x;
        System.out.println(x);
    }

    public static double power(double x , int y) {
        return Math.pow(x , y);
    }

    public static void test(String[] arguments){
        int x = 5;
        int y = 72;
        if (x == 5){
            x = 6;

            y = 72;

            System.out.println("x = " + x + " y = " + y);

        }
        System.out.println("x = " + x + " y = " + y);
    }

}