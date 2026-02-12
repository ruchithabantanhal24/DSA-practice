import java.util.*;
public class DuplicateCharacter {
    public static void main(String[] args){
        String s = "ruchitha is a good girl";
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(Character key : mp.keySet()){
            if(mp.get(key)>1){
                System.out.println(key + " " + mp.get(key));
            }
        }

    }
}