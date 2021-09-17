package arraytasks;

import java.util.Scanner;

public class MinimumDistance {
    public int minDis(int [] array,int x, int y){
       int index1=-1;
       int index2=-1;
       int len=array.length;
       int min=Integer.MAX_VALUE;
        for (int i = 0; i <len ; i++) {
           if(x==array[i]){
               index1=i;
           }
           if(y==array[i]){
               index2=i;
           }
            if(index1!=-1&&index2!=-1){
                if(Math.abs(index1-index2)< min) {
                    min = Math.abs(index1-index2);
                }
            }

        }
        if(index1!=-1&&index2!=-1){
            return min;
        }
        else{
            return -1;
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
        System.out.println("Enter the value for X :");
        int x=sc.nextInt();
        System.out.println("Enter the value for y :");
        int y=sc.nextInt();
        MinimumDistance m=new MinimumDistance();
        int ans= m.minDis(array,x,y);
        System.out.println("Minimum Distance is :"+ans);
    }
}
