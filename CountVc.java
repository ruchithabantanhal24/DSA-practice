import java.util.Scanner;
public class CountVc {
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vow =0,con = 0;
        for(int i =0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vow++;
            }else{
                con++;
            }
        }
        System.out.println("vowels:" + vow + " " + "consonants:"+con );
    }
}