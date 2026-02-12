import java.util.Scanner;
public class CountWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int spaces = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                spaces++;
            }
        }
        System.out.println("No.of.Words:"+ (spaces+1));
    }
}