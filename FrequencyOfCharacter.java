import java.util.*;
public class FrequencyOfCharacter {
    public static void main(String[] args){
        String s = "Java Programming";
        LinkedHashMap<Character,Integer> mp = new LinkedHashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for(Character i : mp.keySet()){
            System.out.println(i + ":"+ mp.get(i));
        }

    }
}