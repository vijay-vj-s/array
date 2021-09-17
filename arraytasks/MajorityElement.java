package arraytasks;

import java.util.Scanner;

public class MajorityElement {
    public int majorityElement(int[] array){
       int candidate=array[0];
       int count=1;
       for(int i=1;i<array.length;i++){
           if(array[i]==candidate){
               count++;
           }
           else{
               count--;
               if(count==0){
                   candidate=array[i];
                   count=1;
               }
           }
       }
       count=0;
       for(int i=0;i<array.length;i++){
           if(array[i]==candidate){
              count++;
           }
           if(count> array.length/2) {
               return candidate;
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
        MajorityElement me=new MajorityElement();
        int candidate=me.majorityElement(array);
        if (candidate == -1) {
            System.out.println("No majority");
        }
        else {
            System.out.println("Candidate key is :"+ candidate);
        }

    }
}
