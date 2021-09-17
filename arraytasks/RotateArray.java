package arraytasks;
import java.util.Arrays;
import java.util.Scanner;
class RotateArray {
   void rotate(int []array,int k){
       k=array.length%2;
       reverse(array,0,array.length-1);
       reverse(array,0,k);
       reverse(array,k+1, array.length-1);
   }
   void reverse(int [] array,int start,int end){
       while(start<end){
           int temp=array[start];
           array[start]=array[end];
           array[end]=temp;
           start++;
           end--;
       }
   }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        RotateArray rotate = new RotateArray();
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        System.out.println("Enter "+size+" elements :");
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the k value :");
        int k=sc.nextInt();
        RotateArray ra=new RotateArray();
        ra.rotate(array,k);

        System.out.println(Arrays.toString(array));
    }
}


