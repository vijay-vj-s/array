package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
    public void maxAndMin(int []array){
        Arrays.sort(array);
        int start=0;
        int end=array.length-1;
        int [] newArray=new int[array.length];
        int i = 0;
        while(start<=end){
            if(i%2==0){
                newArray[i++]=array[end--];
            }
            else{
                newArray[i++]=array[start++];
            }


        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        int size=sc.nextByte();
        System.out.println("Enter "+size+" elements :");
        int[]array=new int[size];
        for(int i=0;i<array.length;i++) {
            array[i] = sc.nextInt();
        }
        MaxAndMin mm=new MaxAndMin();
        mm.maxAndMin(array);
    }
}
