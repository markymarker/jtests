
public class array2d {

    private static int[][] tarr;

    public static void main(String[] args){
        tarr = new int[4][5];

        // Doesn't work -- cannot referr to 2d array with 1d syntax
        // And vice-versa of course does not work either
        // for(int j = 0; j < tarr.length; ++j) tarr[j] = j;

        for(int x = 0; x < tarr.length; ++x)
            for(int y = 0; y < tarr[x].length; ++y)
                tarr[x][y] = x + y;

        printCell(0, 0);
        printCell(0, 2);
        printCell(2, 2);
        printCell(3, 0);
        printCell(3, 4);

        System.out.println();

        // Dump array
        for(int x = 0; x < tarr.length; ++x){
            for(int y = 0; y < tarr[x].length; ++y)
                System.out.print(", " + tarr[x][y] + " ,");
            System.out.println();
        }
    }

    private static void printCell(int x, int y){
        System.out.println("[" + x + "][" + y + "]: " + tarr[x][y]);
    }

}

