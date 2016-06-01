/**
 * Created by uservm on 01.06.16.
 */
public class monkeyTrouble {

    public static void main(String[] args){
        System.out.print(monkeyTrbl(true, true));
    }

    /*We have two monkeys, a and b, and
    the parameters aSmile and bSmile indicate if each is smiling.
     We are in trouble if they are both smiling or if neither of them is smiling.
     Return true if we are in trouble.

     */
    public static boolean monkeyTrbl(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;

    }
}
