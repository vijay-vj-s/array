package arraytasks;


import java.util.*;

public class FrequencySort {
    public void sortByFrequency(int []array){


        Map<Integer,Integer>frequency=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(frequency.containsKey(array[i])){
//                frequency.get(array[i]);
                frequency.put(array[i], frequency.get(array[i])+1);
            }
            else {
                frequency.put(array[i], 1);
            }
        }
       // System.out.println(frequency);

        class FrequencyComparator implements  Comparator<Integer> {

            Map<Integer, Integer> map = new HashMap<>();

            public FrequencyComparator(Map<Integer, Integer> map) {
                this.map = map;
            }

            @Override
            public int compare(Integer o1, Integer o2) {
                Integer value1 = map.get(o1);
                Integer value2 = map.get(o2);

                int ans = value2.compareTo(value1);
                return ans == 0 ? o2.compareTo(o1) : ans;
            }
        }

        FrequencyComparator obj = new FrequencyComparator(frequency);

        Map<Integer,Integer>treeMap=new TreeMap<>(obj);
        treeMap.putAll(frequency);


        for(Map.Entry<Integer,Integer> ans: treeMap.entrySet()){
            for (int i=0;i<ans.getValue();i++){
                System.out.print(ans.getKey());
            }
        }

    //   System.out.println(treeMap);



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        int size=sc.nextByte();
        System.out.println("Enter "+size+" elements :");
        int[]array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        FrequencySort f=new FrequencySort();
        f.sortByFrequency(array);
    }
}
