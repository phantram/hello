import java.util.Scanner;

/**
 * This program finds the minimum value of an array of numbers.
 */
public class FindMin {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numbers = new int [length];

        for(int i = 0; i < length; i = i + 1){
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];

        for(int x = 0; x < numbers.length; x = x + 1){
            if(numbers[x] < min){
                min = numbers[x];
            }
        }
        System.out.println(min);
    }
}
