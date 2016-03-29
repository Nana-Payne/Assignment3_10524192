/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10524192;

/**
 *
 * @author Nana Payne
 */
public class GettingIndividualDigits 
{
     public static void  main(String[] arg)
    {
        for(int i =0;i<=9;i++)
        {
            for(int y=0;y<=9;y++)
            {
                int v = i+y;
                System.out.printf("%d%d, ",i,y);
                System.out.printf("%d+%d=%d %n",i,y,v);
            }
        }
    }
    
}
