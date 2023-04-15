class Pangram {
    public static boolean checkIfPangram(String sentence) {
        char temp ;
        for(int i =0 ; i<sentence.length();i++)
        {
            temp = sentence.charAt(i);
            for(int j =0 ; j <sentence.length() ;j++)
            {   
                if (i==j)
                    continue;
                else if(temp==sentence.charAt(j))
                    return false ;
            }
        }
        return true ;


    }

    public static void main(String[] args) {
	String st = "ltcode";
    
	System.out.println(checkIfPangram(st));
}
}