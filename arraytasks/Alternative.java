package arraytasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Alternative {
    public  void rearrange(int[]array){
        Queue<Integer> positive = new LinkedList<>();
        Queue<Integer> negative = new LinkedList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]>=0) {
                positive.add(array[i]);
            }
            else{
                negative.add(array[i]);
            }
        }
        int i=0;

      while(!positive.isEmpty()&& !negative.isEmpty()){

          if(i%2==0){
             array[i++]= positive.remove();
          }
          else {
              array[i++] = negative.remove();
          }
      }
      while(!negative.isEmpty()){
          array[i++]=negative.remove();
      }
        while(!positive.isEmpty()){
            array[i++]=positive.remove();
        }
        System.out.println("rearrange Array is :"+ Arrays.toString(array));
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
        Alternative a=new Alternative();
        a.rearrange(array);
    }
}
