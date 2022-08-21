import java.util.Scanner;
import java.util.regex.*;
public class Solution {
    public static boolean isNumber(String s) {
        
        if(s.isEmpty())
            return false;

        if(Pattern.matches("\\d+",s) || Pattern.matches("\\d+[.]",s) || Pattern.matches("\\d+[.]\\d+",s) || Pattern.matches("[.]\\d+",s) || Pattern.matches("[+-]\\d+[.]?",s) || Pattern.matches("[+-][.]\\d+",s) || Pattern.matches("[+-]\\d+[.]\\d+",s)|| Pattern.matches("[+-]?[\\d+]*[.]?\\d+[eE][+-]?\\d+",s) || Pattern.matches("\\d+[.][\\d+]*[eE]\\d+",s) || Pattern.matches("[+-]\\d+[.]\\d+[eE]\\d+",s) || Pattern.matches("[+-]?\\d+[.][e][-+]?\\d+",s))
            return true;
        
        return false;
    
    }

    public static void main(String args[])
    {
        String str;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        str  = sc.nextLine();
        System.out.println(isNumber(str));
    }
}