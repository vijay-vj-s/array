package arraytasks;

import java.util.Scanner;

public class FindMinimum {

    //int min=Integer.MAX_VALUE;
    public int minValue(int[] array){
      for(int i=0;i<array.length-1;i++){
          if (array[i] > array[i+1]) {
             return array[i+1];
          }
      }

        return array[0];
    }

    public void max(int[]array){
        int ans=0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]<array[i+1]){
                ans=  array[i+1];
            }
        }
        System.out.println(ans);
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
        FindMinimum fm=new FindMinimum();
       int ans= fm.minValue(array);
        System.out.println("Minimum Value is :"+ans);
        fm.max(array);
    }
}
