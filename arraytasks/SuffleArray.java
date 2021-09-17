package arraytasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SuffleArray {

    public  void suffle(int[] array){
      Queue<Integer>firstHalf=new LinkedList<>();
      Queue<Integer>secondHalf=new LinkedList<>();
      for(int i=0;i<array.length/2;i++){
          firstHalf.add(array[i]);
      }
      for(int i=array.length/2;i<array.length;i++){
          secondHalf.add(array[i]);
      }

        int i=0;
        while(!firstHalf.isEmpty()&& !secondHalf.isEmpty()){

            if(i%2==0){
                array[i++]= firstHalf.remove();
            }
            else {
                array[i++] = secondHalf.remove();
            }
        }
        while(!secondHalf.isEmpty()){
            array[i++]=secondHalf.remove();
        }
        while(!firstHalf.isEmpty()){
            array[i++]=secondHalf.remove();
        }
        System.out.println("Suffle  Array is :"+ Arrays.toString(array));


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        int size=sc.nextByte();
        if(size%2!=0){
            System.out.println("Size must be Even");
        }
        else {


            System.out.println("Enter " + size + " elements :");
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            SuffleArray sa = new SuffleArray();
            sa.suffle(array);
        }
    }
}
