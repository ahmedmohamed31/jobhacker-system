class Palindrome  {
    public static boolean palindrome(String sentence) {
		for(int i =0 ; i<sentence.length()/2;i++)
        {	
			if (sentence.charAt(i)==sentence.charAt(sentence.length()-(i+1)))
				continue;
			return false;
          
		}
		return true;
	}	
		
    public static void main(String[] args) {
	String st = "jobhacker";
    
	System.out.println(palindrome(st));
	st = "parrap";
    
	System.out.println(palindrome(st));
	}
}