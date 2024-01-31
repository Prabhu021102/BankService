package org.example;
import java.util.*;
public class Substring {
    public static boolean solve(int i1,int i2,String[] arr1,String[] arr2,int l1,int l2)
    {
        //base condition
        if(i2==l2) {
            return true;
        }
        if(i1==l1)
        {
            return false;
        }
        //pick
        if(arr1[i1].equals(arr2[i2]))
        {
            return solve(i1+1,i2+1,arr1,arr2,l1,l2);
        }
        //not pick
        return solve(i1+1,0,arr1,arr2,l1,l2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string:");
        String str=sc.nextLine();
        System.out.println("Enter the substring:");
        String substr=sc.nextLine();
        String[] arr1=str.split(" ");
        String[] arr2=substr.split(" ");
        boolean isPresent=solve(0,0,arr1,arr2,arr1.length,arr2.length);
        System.out.println(isPresent);
    }
}
