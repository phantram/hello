import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tram on 6/22/17.
 */
public class ReverseRoot {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList numbers = new ArrayList();

        while(scanner.hasNextLong()){
            numbers.add(scanner.nextLong());
        }

        for(int i = numbers.size() - 1; i >= 0; i = i - 1){
            Long number = (Long) numbers.get(i);
            System.out.printf("%.4f\n" , Math.sqrt(number));
        }

    }
}
