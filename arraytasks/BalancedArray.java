package arraytasks;

import java.util.Scanner;

public class BalancedArray {
    public  void difference(int[]array){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<array.length/2;i++){
            sum1+=array[i];
        }
        for(int i= array.length/2;i<array.length;i++){
            sum2+=array[i];
        }
        int ans=sum2-sum1;
        System.out.println("Difference is :"+ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        int size=sc.nextByte();
        if(size%2!=0){
            System.out.println("size must even");

        }
        else {
            System.out.println("Enter " + size + " elements :");
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            BalancedArray ba = new BalancedArray();
            ba.difference(array);
        }
    }
}
