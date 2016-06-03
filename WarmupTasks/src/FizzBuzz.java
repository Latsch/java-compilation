/**
 * Created by uservm on 03.06.16.
 */
public class FizzBuzz {

    public static void main(String[] args){
        FizzBuzz();
    }

    /*
        FizzBuzz Problem
     */
    private static void FizzBuzz(){

        for(int i = 0; i< 100 ; i++){
            if ( i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz " + i);
            else
            {
                if( i % 3 == 0){
                    System.out.println("Fizz " + i);
                }
                else
                {
                    if( i % 5 == 0)
                        System.out.println("Buzz " + i);
                }
            }

        }
    }
}
