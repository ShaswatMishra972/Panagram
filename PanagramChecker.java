
package com.exe.java;

import java.util.Scanner;

/**
 *
 * @author Shaswat mishra
 */
public class PanagramChecker {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String ");
        String input=sc.nextLine().toLowerCase();
        sc.close();
        if(toPanagram(input))
        {
            System.out.println("The Input Is Panagram.");
        }else{
             System.out.println("The Input Is Not Panagram.");
            
        }
   
        
        
    }
    public static boolean toPanagram(String input)
    {
        boolean let[]=new boolean[26];
        for(int i=0;i<input.length();i++)
        {
          char ch=input.charAt(i);
          if(ch>='a'&&ch<='z')
          {
              let[ch-'a']=true;
          }
        }
        for(boolean letter:let)
        {
            if(!letter)
            {
                return false;
            }
        }
        return true;
        
    }
    
}
