class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int smalletstWordSize=0;
        int smalletstWordIndex=0;
       for(int i=0;i<strs.length;i++){
           
           if(strs[smalletstWordIndex].length()>strs[i].length())
           smalletstWordIndex=i;

       } 
        boolean state = true;
       for(int i =0  ; i < strs[smalletstWordIndex].length();i++)
        {	state = true;
            
            for(int j =0 ; j<strs.length;j++)
            {	
				
                if (strs[j].contains(strs[smalletstWordIndex]))
                {}
                else 
                    {
                    state=false;
                    break;
                    }
            }
            if (state==true)
            return strs[smalletstWordIndex];
            strs[smalletstWordIndex]=strs[smalletstWordIndex].substring(i+1);
        }
		return null;
    }
	public static void main(String[] args) {
	String[] array = {"flower","flo","floght"};
    String Res =longestCommonPrefix(array) ;
	System.out.println(Res);
         
            
        }
    
}