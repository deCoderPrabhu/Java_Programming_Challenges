package javaPracticeProblems;

class ReverseTheString{
    
    public static void main(String[] args){
        
        String str = "My Name is Nishant";
        System.out.println(reverseString(str));
    }
    
    public static String reverseString(String str){
        
        String input_String = str;
        String outputString = "";
        
        for(int i=input_String.length()-1;i>=0;i--){
            outputString = outputString + input_String.charAt(i);
        }
        
        return outputString;
    }
}
