/**
 * Created by uservm on 01.06.16.
 */
public class diff21 {


    public  static void main(String[] args){
        System.out.println(diff21(23));
    }

    /*
        Number minus 21. If number is smaller, return difference.
        If number is bigger return absolute difference and double it.
     */
    private static int diff21(int number){

        if(number > 21){
            return ((number - 21)*2);
        }
        else
        {
            return (21 - number);
        }

    }
}
