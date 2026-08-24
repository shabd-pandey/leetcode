//leetcode premum question 
import java.util.*;
class EncodeandDecodeStrings {

    public String encode(List<String> strs) {

        if (strs.size()==0){
            return Character.toString((char)248);
        }
        String seperate = Character.toString((char)247);
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s);
             sb.append(seperate);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }

    public List<String> decode(String str) {

        if(str.equals(Character.toString((char)248))){
            return new ArrayList<>();
        }
        String seperate = Character.toString((char)247);

        return Arrays.asList(str.split(seperate,-1));
    }
}
