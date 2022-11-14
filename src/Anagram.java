import javax.swing.*;
import java.util.*;

public class Anagram {

    public static boolean isAnagram(String firstWord,String secondWord){
        List<String> firsWordList=new ArrayList<>(Arrays.asList(firstWord.toLowerCase().split("")));
        List<String> secondWordList=new ArrayList<>(Arrays.asList(secondWord.toLowerCase().split("")));
        Set<String> myMap=new HashSet<>(firsWordList);
        for(String s:myMap){
            if(Collections.frequency(firsWordList,s.toLowerCase())!= Collections.frequency(secondWordList,s.toLowerCase())){
                return false;
            }
        }
        return true;
    }
}
