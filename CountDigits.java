public class CountDigits {
    public static void main(String[] args){
        int n = 36724 , count = 0;
        while(n != 0){
            count += 1;
            n = n/10;
        }
        System.out.println(count);
    }
}