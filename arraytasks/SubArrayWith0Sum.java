package arraytasks;

import java.util.*;

public class SubArrayWith0Sum {
    public boolean subArray(int[] array){
        Set<Integer>set=new HashSet<>();
        int sum=0;
       boolean check=false;
        for(int i=0;i<array.length;i++) {
            sum+=array[i];
            if(array[i]==0||sum==0||set.contains(sum)) {
                set.add(sum);
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of th array :");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements :");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        SubArrayWith0Sum s=new SubArrayWith0Sum();
        boolean ans=s.subArray(array);
        if(ans==true){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
