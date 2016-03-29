/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_10524192;

/**
 *
 * @author Nana Payne
 */
import java.util.Scanner;
public class ARefresher 
{
    public static void main(String[] arg)
    {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter your name");
    String name=input.next();
    if(name.equals ("Baffoe"))
    for(int i=1;i<=5;i++)
    {
        System.out.printf(i+")"+name+"%n");
    }
    else
    {
        for(int i=1;i<=10;i++)
        {
            System.out.printf(i+")"+name+"%n");
        }
    }
         
    
    
    
    
}
}

