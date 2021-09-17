package arraytasks;

import java.util.Scanner;

public class MaximumSumOfArray {
    public  int maxOfSum(int[] array){

        int localMax=0;
        int globalMax=Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++){
            localMax+=array[i];
            if (localMax>globalMax){
                globalMax=localMax;

            }
            if(localMax<0){
                localMax=0;

            }

        }
        return globalMax;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        int size=sc.nextByte();
        System.out.println("Enter "+size+" elements :");
        int[]array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        MaximumSumOfArray m=new MaximumSumOfArray();
        int ans=m.maxOfSum(array);

            System.out.println("Maximum sum of array is :" +ans);




    }
}
