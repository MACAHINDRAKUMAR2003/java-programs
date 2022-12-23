public class MultipleCatch {  
  
    public static void main(String[] args) {  
          
           try{
                int a[]=new int[5];    
    		System.out.println(a[6]);
		int d[]=new int[5];
		d[5]=79/0;
		String s="hello ";
		System.out.println(s.charAt(54));
		int c=Integer.parseInt("456");			
		

               }    
               catch(ArithmeticException e1)  
                  {  
                   System.out.println("Arithmetic Exception occurs"+e1);  
                  }    
               catch(ArrayIndexOutOfBoundsException e2)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs"+e2);  
                  }    
               catch(NumberFormatException e3)  
                  {  
                   System.out.println("NumberFormatException "+e3);  
                  }             
               System.out.println("rest of the code");    
    }  
}  