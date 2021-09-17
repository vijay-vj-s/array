package arraytasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeadersInTheArray {
    public void leaders(int[]array) {
        int len = array.length;
        System.out.println("Leaders are :");
        for (int i = 0; i < len; i++) {
            int j;
            for ( j = i+1; j < len; j++) {
                if(array[i]<=array[j]){
                    break;
                }
            }
            if( j==len){
                System.out.println(array[i]);
            }
        }

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
        LeadersInTheArray l=new LeadersInTheArray();
        l.leaders(array);

    }
}
