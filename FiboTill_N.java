package org.example;
import java.util.Scanner;

public class FiboTill_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int N=sc.nextInt();
        int f1=0;
        int f2=1;
        int curr=0;
        System.out.print(f1+" "+f2+" ");
        while(f1+f2<N)
        {
            curr=f1+f2;
            f1=f2;
            f2=curr;
            System.out.print(curr+" ");
        }
    }
}
