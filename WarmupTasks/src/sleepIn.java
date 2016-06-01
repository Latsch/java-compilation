
public class sleepIn {

    public static void main(String[] args){
        System.out.println(sleepIn(true, false));
    }


    /* If its a weekday, you cant sleep in, weekend -> sleeping in
    * If on Vacation, you will sleep in whether weekday or not
    * */
    private static boolean sleepIn(boolean weekday, boolean vacation){
        if( !weekday || vacation)
            return true;

        return false;

    }

}