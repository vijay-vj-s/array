package arraytasks;

import java.util.Arrays;
import java.util.Scanner;

public class WaveForm {
    public void waveForm(int [] array){
        for(int i=0;i<array.length-1;i+=2) {

                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;

        }
        System.out.println("ans is :"+ Arrays.toString(array));

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
        WaveForm wf=new WaveForm();
        wf.waveForm(array);
    }
}
