/**
 * Created by tram on 6/18/17.
 */
public class math {
    public static void main(String[] args){
        int[] numbers = {1, 3, 2};

        int currentMax = numbers[0];

        for(int i = 0; i < numbers.length; i = i + 1){
            if(numbers[i] > currentMax){
                currentMax = numbers[i];
            }
        }
        System.out.println(currentMax);
    }
}
