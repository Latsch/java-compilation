
public class sleepIn {

    public static void main(String[] args){
        System.out.println(sleepIn(true, false));
    }


<<<<<<< HEAD
    /* If its a weekday, you cant sleep in, weekend -> sleeping in
    * If on Vacation, you will sleep in whether weekday or not
    * */
=======
>>>>>>> b66b5cc1362e521162c6203b59eb7a398c8f615a
    private static boolean sleepIn(boolean weekday, boolean vacation){
        if( !weekday || vacation)
            return true;

        return false;

    }

}