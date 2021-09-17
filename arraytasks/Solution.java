package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public  void smallerNumbersThanCurrent(int[]array){

        int[]newArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[i]>array[j]){
                    count++;
                }
            }
            newArray[i]=count;
        }
        System.out.println("Smaller Numbers than Current :");
        System.out.println( Arrays.toString(newArray));
    }

//    static String printArray(int[] array) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[" );
//
//        for (int i: array) {
//            sb.append(i + ",");
//        }
//        sb.deleteCharAt(sb.length()-1);
//        sb.append("]");
//        return sb.toString();
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        int size=sc.nextByte();
        System.out.println("Enter "+size+" elements :");
        int[]array=new int[size];
        for(int i=0;i<array.length;i++) {
            array[i] = sc.nextInt();
        }
        Solution s=new Solution();
        s.smallerNumbersThanCurrent(array);
    }
}
