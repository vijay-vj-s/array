package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public void smallestElement(int [] array,int k){
        Arrays.sort(array);
        System.out.println("Second Smallest value is :"+array[k-1]);

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
        System.out.println("Enter the k value :");
        int k=sc.nextInt();
        KthSmallest ks=new KthSmallest();
        ks.smallestElement(array,k);
    }
}
