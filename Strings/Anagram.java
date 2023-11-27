import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    String str1="hellhp";
	    String str2="eellhh";
	    if(str1.length() != str2.length()){
	       System.out.println("Strings are not  anagram");
	        return;
	    }
	   char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean flag=true;
        for(int i=0;i<charArray1.length;i++){
            if(charArray1[i]!=charArray2[i]){
                flag=false;
                System.out.println("The two Strings are not angram");
                break;
            }
        }
        if(flag)
		System.out.println("Strings are anagram");
	}
}
