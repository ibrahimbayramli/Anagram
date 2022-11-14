import java.util.*;

public class Anagram {

    public static boolean isAnagram(String firstWord,String secondWord){
        List<String> firsWordList=new ArrayList<>(Arrays.asList(firstWord.toLowerCase().split("")));
        List<String> secondWordList=new ArrayList<>(Arrays.asList(secondWord.toLowerCase().split("")));

        for(int i=0;i<firstWord.length();i++){
            if(Collections.frequency(firsWordList,firstWord.charAt(i))!=Collections.frequency(secondWordList,firstWord.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
