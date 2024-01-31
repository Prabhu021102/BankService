package org.example;
import java.util.*;
public class ToggleChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input:");
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            Character ch=arr[i];
            if(Character.isLowerCase(ch))
            {
                arr[i]=(char)Character.toUpperCase(ch);
            }else arr[i]=(char)Character.toLowerCase(ch);
        }
        System.out.println("Toggled String:"+String.valueOf(arr));
    }
}
