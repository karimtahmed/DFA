/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfa;

import java.io.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class DFA {

    /**
     * @param args the command line arguments
     */
    private static final String REGEX = "\\b[1|2][,][a|b]\\b";
    private static final String REG = "\\b[012]\\b";

    public static void main(String[] args) throws FileNotFoundException, IOException{

       String file = "dfa.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
          String st= br.readLine();
          String start="";
          String end="";
          int count = 0;
          int a1=0;
          int b1=0;
          int s=0;
          String[] a=new String[10];
          String[] b=new String[10];
          char[] A=new char[10];
          char[] B=new char[10];
            String c;
            Scanner sc=new Scanner(System.in);
            
            String x;
            System.out.print("enter your word : ");
            x=sc.next();
                     for(int i=0;i<=1;i++)
             {
            Pattern p = Pattern.compile(REG);
           Matcher m = p.matcher(br.readLine());
            while(m.find()) {
           st=m.group();
                       if(i==0)
                       {              start=st;
                                   System.out.println(start);
            }
                       if(i==1){
                           end=st;
                        System.out.println(end);}
           }
            }
            while (count<6)
           //for(int i=0;i<5;i++)
            {
                Pattern p = Pattern.compile(REGEX);
           Matcher m = p.matcher(br.readLine()); // get a matcher object
           
           

           while(m.find()) {
                    
           st=m.group();
//                       System.out.println(st);
                      s=count%2; 
            if(s==0)
                {  
                      a[a1]=st;
                      a1++;
                       }
            if(s==1)
                {  
                      b[b1]=st;
                      b1++;
                       }
            
//           System.out.println("Match number "+count); 
           count++;
           } 
           for(int i=0;i<a1;i++){
               A[i]=a[i].charAt(0);
               B[i]=b[i].charAt(0);
//           System.out.println("values: "+a[i]+" , "+b[i]);
//           System.out.println("values: "+A[i]+" , "+B[i]);
           }

           }
            char sta =start.charAt(0);
 char en=end.charAt(0);
 char loc=sta;
 int y=0;
 
 for(int i=0;i<x.length();i++)
 {
     if(x.charAt(i)=='a')
 {
     y=Character.getNumericValue(loc);
    loc=A[y];
     
     

 
 }else if(x.charAt(i)=='b')
 {
     y=Character.getNumericValue(loc);
     loc=B[y];
    
 
 }
 System.out.println("state : "+loc );
 }
 if(loc==en)
 {
    System.out.println("accepted");
 }
 else{ 
   System.out.println("unaccepted");
 }
          br.close(); } 
           
}
           
    


    
    

