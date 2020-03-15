package com.tgt;

import java.util.*;

public class demo
{
    demo()
    {
        System.out.println("Just a try");
    }
    public static void main(String[] args)
    {
        demo d=new demo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int n=sc.nextInt();
        int x=demo.fact(n);
        System.out.println("factorial is\t"+x);
    }
    public static int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}

