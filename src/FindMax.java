import java.util.Scanner;

/**
 * This program finds the max of an array of numbers.
 */
public final class FindMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        for(int a = 0; a < length; a = a + 1){
            numbers[a] = scanner.nextInt();
        }

        int currentMax = numbers[0];

        for(int i = 0; i < numbers.length; i = i + 1){
            if(numbers[i] > currentMax){
                currentMax = numbers[i];
            }
        }
        System.out.println(currentMax);
    }
}
