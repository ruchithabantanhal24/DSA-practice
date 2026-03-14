import java.util.*;
public class SumUntilNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        while(true){
            num = sc.nextInt();

            if(num == -1){
                break;
            }

            sum = sum+num;
        }

        System.out.println(sum);
    }
}