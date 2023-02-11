package samplePrograms;

public class reverseString {
		
	    public String reverse(String str) 
	    {     
	        if ((str==null)||(str.length() <= 1) )
	            return str;
	        return reverse(str.substring(1)) + str.charAt(0);
	    }
	    public static void main(String[] args) 
	    {
	    	reverseString obj=new reverseString();
	    	String str = "Testing";
	        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");    
	    }    
	}
