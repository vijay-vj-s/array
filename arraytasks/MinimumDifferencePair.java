package arraytasks;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferencePair {
    public void minDiffPair(int[] array) {
        Arrays.sort(array);
        int min=Integer.MAX_VALUE;
         for(int i=0;i<array.length-1;i++){
            if( min>array[i+1]-array[i]){
                min=array[i+1]-array[i];
             }
        }

        System.out.println("Minimum Distance between two array is :" + min);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements :");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        MinimumDifferencePair md = new MinimumDifferencePair();
        md.minDiffPair(array);
    }
}
