
import java.util.HashSet;


public class hs_array {

    public static void main(String[] args){
        // Not able to use a generic as the basis for an array
        // HashSet<Integer>[] list;

        // Can't do this
        // list = new HashSet<Integer>[5];

        // Can't really do this either (fails in runtime)
        // list = (HashSet<Integer>[])(new Object[5]);

        System.out.println("FIRST: Succeeded doing nothing because none of it is allowed");

// // // // // // // //

        // The below compiles with a warning, but it's a way of working around
        // Though, there's more likely a cleaner solution that depends on the
        // specific case (e.g. ArrayList, custom object container for HS, etc.)

        HashSet<Integer> hs = new HashSet<>(2);
        hs.add(6);

        Object[] list = new Object[5];
        list[0] = hs;

        if( ((HashSet<Integer>)list[0]).contains(6) ){
            // Spoilers: It's this one
            System.out.println("SECOND: It worked with object");
        } else {
            System.out.println("SECOND: It didn't work with object");
        }

        System.out.println("VERDICT: At least something worked");
    }

}

