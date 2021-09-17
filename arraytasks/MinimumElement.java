package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public void minElement(int[]array){
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RotateArray rotate = new RotateArray();
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        System.out.println("Enter "+size+" elements :");
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        MinimumElement m=new MinimumElement();
        m.minElement(array);
    }
}
