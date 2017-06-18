import java.util.Scanner;

/**
 * This program calculates 2 numbers provided by user
 */
public final class Sum2RanNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + y);
    }
}