import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }else{
            for(int den = 2;den*den<=n;den++){
                if(n%den == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPrime(n);
        if(res == true){
            System.out.println("it is a prime");
        }else{
            System.out.println("Not a prime");
        }

    }
}