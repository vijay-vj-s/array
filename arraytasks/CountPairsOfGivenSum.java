package arraytasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairsOfGivenSum {
    public void pairsCount(int [] array,int sum) {
        int count = 0;
        //  First Method
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    count++;
                }
            }

        }
        System.out.println("count of the pairs are :"+count);
    }

    //  Second method
//        Arrays.sort(array);
//        int i=0;
//        int start=0;
//        int end=array.length-1;
//        while(start<end){
//            if(array[start]+array[end]==sum){
//                start++;
//                end--;
//                count++;
//
//            } else if (array[start] + array[end]<sum) {
//               start++;
//            }
//            else if(array[start]+array[end]>sum){
//                end--;
//            }
//        }

//        Map<Integer,Integer>map=new HashMap<>();
//        for(int i=0;i<array.length;i++){
//            int comp = sum - array[i];
//            if(map.containsKey(comp)) {
//                count += map.get(comp);
//
//            }
//          //  System.out.println(count);
//            map.put(array[i], map.getOrDefault(array[i],0)+1);
//
//        }
//       // System.out.println(map);
//        System.out.println("pairs of count is :"+count);
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
        System.out.println("Enter the sum value :");
        int sum=sc.nextInt();
        CountPairsOfGivenSum cp=new CountPairsOfGivenSum();
        cp.pairsCount(array,sum);
    }
}
