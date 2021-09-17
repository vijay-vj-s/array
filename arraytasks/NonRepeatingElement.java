package arraytasks;

import java.util.Scanner;

public class NonRepeatingElement {
    public int firstNonRepeatElement(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            boolean found=false;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j] && i!=j){
                    found=true;
                    break;
                }
            }
//            System.out.println(found);
            if(!found){
                return array[i];
            }

        }
        return -1;
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
        NonRepeatingElement nr=new NonRepeatingElement();
       int ans= nr.firstNonRepeatElement(array);
       if(ans==-1){
           System.out.println("No repeated elements ");
       }
       else{
           System.out.println("First Non Repeated Element is :"+ans);
       }

    }
}
