import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0,last;
        int num = n;
        while(n>0){
            last = n%10;
            res = res*10 + last;
            n=n/10;
        }
        if(num == res){
            System.out.println("A palindrome number");
        }else{
            System.out.println("not a palindrome number");
        }

    }
}