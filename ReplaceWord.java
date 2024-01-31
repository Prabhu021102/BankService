package org.example;
import java.util.*;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input string:");
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        System.out.println("Enter target word:");
        String target=sc.nextLine();
        System.out.println("Enter replace word:");
        String replace=sc.nextLine();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(target))
            {
                arr[i]=replace;
            }
        }
        for(String ch:arr)
        {
            System.out.print(ch+" ");
        }
    }
}
