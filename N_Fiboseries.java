package org.example;
import java.util.*;
public class N_Fiboseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(0,0);
        arr.add(1,1);
        for(int i=2;i<n;i++)
        {
            arr.add(i,arr.get(i-1)+arr.get(i-2));
        }
        for(Integer i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
