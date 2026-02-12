import java.util.Scanner;
public class Palindrome{
    public static boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean res = isPalindrome(s);
        if(res == true){
            System.out.println("A Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
    }
}