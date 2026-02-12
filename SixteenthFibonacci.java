public class SixteenthFibonacci {
    public static void main(String[] args){
        int a=0,b=1,c=0;
        for(int i = 3;i<=16;i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}