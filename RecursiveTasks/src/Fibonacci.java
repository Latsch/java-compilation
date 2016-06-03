import java.util.ArrayList;
import java.util.List;

/**
 * Created by uservm on 03.06.16.
 */
public class Fibonacci {

    public static void main(String[] args){

        List<Integer> fib = new ArrayList<Integer>();
        Fibonacci(10, fib);
        System.out.println(fib);

    }

    /*
        Putting the Numbers of the Fibonacci Sequence recursively into a List.
     */
    private static void Fibonacci(int n, List<Integer> fib){
        if(fib.size() != n) {
            if (fib.size() == 0) {
                fib.add(0);
                fib.add(1);
                Fibonacci(n, fib);
            } else {
                fib.add((fib.get(fib.size() - 2)) + (fib.get(fib.size() - 1)));
                Fibonacci(n, fib);
            }
        }

    }
}
