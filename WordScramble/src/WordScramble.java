import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebas on 25.06.2016.
 */
public class WordScramble {

    public List<String> temp = new ArrayList<String>();


    public void Scramble(String word){
        for (int i = 0; i < word.length(); i++){
            if(i+1 < word.length()){
                temp.add(String.valueOf(word.charAt(i)));
                temp.add( String.valueOf(word.charAt(i)) + String.valueOf(word.charAt(i+1)));
            }
        }
        System.out.print(temp);

    }
}
