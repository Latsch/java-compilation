
public class sleepIn {

    public static void main(String[] args){
        System.out.println(sleepIn(true, false));
    }


    private static boolean sleepIn(boolean weekday, boolean vacation){
        if( !weekday || vacation)
            return true;

        return false;

    }

}