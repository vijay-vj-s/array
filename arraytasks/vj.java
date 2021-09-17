package arraytasks;

import java.util.Scanner;

public class vj {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ënter the number of times");
        int n  = scan.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        System.out.println("Enter the num");
        for (int i = 0; i < n; i++) {

            a[i] = scan.nextInt();

        }
        int count1=0;
        for (int i = 0; i < n; i++) {
            int count=0;
            count1++;
            for (int j = i+1; j < n; j++) {
                if(a[i] == a[j]){

                            count++;
                }else{
                    i=j-1;
                    break;
                }
            }
            b[count1] = count+1;
            c[count1] = a[i];
        }
        for(int i=0;i<count1;i++){
            for (int j = 0; j < count1; j++) {
                if(b[i]>b[j]){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                    int temp1 = c[i];
                    c[i] = c[j];
                    c[j] = temp1;
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println(c[i]);
            }


        }

    }
}
