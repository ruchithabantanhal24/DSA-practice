import java.util.Scanner;
public class ArmstrongNumber {
    public static int cntDigits(int n) {
        int cnt = 0;
        while(n!=0){
        cnt+=1;
        n = n/10;
    }
     return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0,num = n,last;
        int cnt = cntDigits(n);
        while(n!=0){
            last = n%10;
            res = res + (int)Math.pow(last,cnt);
            n = n/10;
        }
        if(res == num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }
    }
}