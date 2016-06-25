import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Created by sebas on 25.06.2016.
 */
public class WordScramble {

    public List<String> temp = new ArrayList<String>();


    public String Scramble(String word) throws  IOException{
        for (int i = 0; i < word.length(); i++){
            if(i+1 < word.length()){
                temp.add(String.valueOf(word.charAt(i)));
                temp.add( String.valueOf(word.charAt(i)) + String.valueOf(word.charAt(i+1)));
            }
        }
        return temp.toString();
    }

}

