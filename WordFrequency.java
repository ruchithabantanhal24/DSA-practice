import java.util.Scanner;
public class WordFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "I am a good girl and a good girl suffers a lot";
        s = s.toLowerCase();
        int count = 0;
        String str = sc.next();
        String[] arr = s.split(" ");
        for(String word : arr){
            if(word.equals(str)){
                count++;
            }
        }
        System.out.println(count);

    }
}
