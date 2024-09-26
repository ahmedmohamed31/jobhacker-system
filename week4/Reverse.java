class Reverse  {
    public static void reverse(String sentence) {
        char temp[]=new char[sentence.length()];  
        for(int i =0 ; i<sentence.length();i++)
        {	
			temp[sentence.length()-(i+1)]=sentence.charAt(i); 
          
		}
		String result = new String(temp);
		
		System.out.println(result);}
		
		
    public static void main(String[] args) {
	String st = "jobhacker";
    
	reverse(st);
	}
}