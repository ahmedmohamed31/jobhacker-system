class Parentheses {
    public static boolean isValid(String s) {
        if (s.length()%2!=0)
            return false;
        for(int i =0 ; i<s.length();i++)
        {
            if (i%2==0)
            {
                if(s.charAt(i)=='[' && s.charAt(i+1)==']')
                   continue;
                else if(s.charAt(i)=='('  && s.charAt(i+1)==')')
                   continue;
                else if(s.charAt(i)=='{' && s.charAt(i+1)=='}')
                   continue; 
                else 
                    return  false ;                
        }
    }
	return true ;
}

public static void main(String[] args) {
	String st = "{}()";
    
	System.out.println(isValid(st));
}}