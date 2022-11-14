import javax.swing.*;
import java.util.*;

public class Anagram {

    public static boolean isAnagram(String firstWord,String secondWord){
        List<String> firsWordList=new ArrayList<>(Arrays.asList(firstWord.toLowerCase().split("")));
        List<String> secondWordList=new ArrayList<>(Arrays.asList(secondWord.toLowerCase().split("")));
        Set<String> firsWordMap=new HashSet<>(firsWordList);
        Set<String> secondWordMap=new HashSet<>(secondWordList);
        for(String f:firsWordMap){
            if(Collections.frequency(firsWordList,f.toLowerCase())!= Collections.frequency(secondWordList,f.toLowerCase())){
                return false;
            }
        }
        for(String s:secondWordMap){
            if(Collections.frequency(firsWordList,s.toLowerCase())!= Collections.frequency(secondWordList,s.toLowerCase())){
                return false;
            }
        }
        return true;
    }
}
