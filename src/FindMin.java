import java.util.Scanner;

/**
 * Created by tram on 6/20/17.
 */
public class FindMin {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numbers = new int [length];

        for(int i = 0; i < length; i = i + 1){
            numbers[i] = scanner.nextInt();
        }

        int Min = numbers[0];

        for(int x = 0; x < numbers.length; x = x + 1){
            if(numbers[x] < Min){
                Min = numbers[x];
            }
        }
        System.out.println(Min);
    }
}
