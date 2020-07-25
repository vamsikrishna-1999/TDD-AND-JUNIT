//package task_9;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter a String");
        String s=sc.next();
        Delete_cap_a obj1=new Delete_cap_a();
        s=obj1.delete_cap_a(s,1,'A');
        System.out.println(s);}
    }
}