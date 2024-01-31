package org.example;
import java.util.Scanner;
public class CaseSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the Character: ");
        Scanner sc=new Scanner(System.in);
        Character ch=sc.next().charAt(0);
        if(Character.isLowerCase(ch))
        {
            ch=Character.toUpperCase(ch);
        }else ch=Character.toLowerCase(ch);

        System.out.println("Case switched character:"+ch);
    }
}
