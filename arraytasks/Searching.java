package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public int search(int[] array,int value) {
        Arrays.sort(array);
        System.out.println("Sorted Array is :"+array);
        return search(array, value, 0, array.length-1);
    }
    public int search(int[] array,int value, int l, int r){
        if(l <= r){
            int mid=l+(r-l)/2;

            if(value==array[mid]){
                return mid;
            }
            if(value<array[mid]){
                return search(array,value,l,mid-1);
            }
            if(value>array[mid]){
                return search(array,value,mid+1,r);
            }
        }
        return -1;
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
        System.out.println("Enter the value :");
        int value=sc.nextInt();
        Searching s=new Searching();
        int index=  s.search(array,value);
        System.out.println("Index value is :"+index);
    }
}
