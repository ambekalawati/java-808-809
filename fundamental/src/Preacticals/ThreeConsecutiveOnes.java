package Preacticals;

import java.util.Scanner;

public class ThreeConsecutiveOnes {
	 String str;
	    char b2;
	    int len;
	    int comp;
	    void intial()
	    {   comp=0;
	       System.out.println("Welcome to divisible by 2 DFA Machine "); 
	       System.out.println("To stop the program type exit");
	       System.out.println("Enter any decimal no."); 
	        Scanner obj=new Scanner(System.in);
	          str=obj.nextLine();
	           if(str.equals("exit")){System.exit(0);} 
	       
	          len=str.length();
	        if(len>0)
	        {
	            for(int i=0;i<str.length();i++)
	            {
	                 char  b1=str.charAt(i);
	                   if(b1=='0'|| b1=='1'||b1=='2'|| b1=='3'||b1=='4'|| b1=='5'||b1=='6'|| b1=='7'||b1=='8'|| b1=='9')
	                   {
	                 
	                   }
	                   else{
	                       System.out.println("please provide valid string");
	                       intial();}
	             
	                                    
	            }
	          first() ;
	        
	        }
	        
	       
	    
	    }
	    void first()
	    {
	        if(comp<len){
	    char a1=str.charAt(comp);
	    if(a1=='0'||a1=='2'||a1=='4'||a1=='6'||a1=='8')
	     {
	         comp++;
	         
	      first(); 
	     
	     }else{
	      
	        comp++;
	        second();
	        }
	        }else{System.out.println("Divisible by 2 reminder will be 0");intial();}
	        
	       
	    
	    }
	    void second()
	    {
	        if(comp<len){
	    char a1=str.charAt(comp);
	    if(a1=='0'||a1=='2'||a1=='4'||a1=='6'||a1=='8')
	     {
	         comp++;
	      first(); 
	     
	     }else{
	      
	        comp++;
	        second();
	        }
	        }else{System.out.println(" Not divisible by 2 Remainder will be 1");intial();}
	    
	    }
	    
	    
	    public static void main(String[] args) {
	    	ThreeConsecutiveOnes p4=new ThreeConsecutiveOnes();
	        p4.intial();
	    }
	    
	} 