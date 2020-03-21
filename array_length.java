
public class array_length {

    public static void main(String[] args){
        int[] test = new int[10];
        System.out.println("initial: " + test.length);

        for(int j = 0; j < 4; ++j){
            test[j] = j + 64;
            System.out.println("j: " + test.length);
        }

        System.out.println("Okay, that's it, show's over.");
    }

}

