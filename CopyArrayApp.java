import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
    public static void main(String[] args) {
        int nVals = args.length;
        // to create a new array of ints
        ArrayList<Integer> myVals = new ArrayList<>(nVals);
        ArrayList<Integer> uniqueVals = new ArrayList<>(nVals);
        for (int i = 0; i < nVals; i++) {
            int item = Integer.parseInt(args[i]);
            myVals.add(item);
            if (!uniqueVals.contains(item)) {
                uniqueVals.add(item);
            }
        }
        System.out.println("original values: " + myVals);
        System.out.println("unique values: " + uniqueVals);
    }
}