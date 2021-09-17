package arraytasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodPairs {
    public void goodPairs(int[]array){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
        }
//        Map<Integer,Integer>map=new HashMap<>();
//        for(int i=0;i<array.length;i++){
//
//            if(map.containsKey(array[i])){
//                count+=map.get(array[i]);
//            }
//            map.put(array[i],map.getOrDefault(array[i],0)+1);
//
//        }
//        System.out.println(map);
        System.out.println("Count of the Good pairs is :"+count);
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
        GoodPairs gp=new GoodPairs();
        gp.goodPairs(array);
    }

}
