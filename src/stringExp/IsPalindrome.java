package stringExp;

public class IsPalindrome {

    static String str="A man, a plan, a canal, Panama";
    public static boolean isPalindrome(String str)
    {
        String cleanString=str.replace("^a-zA-A0-9","").toLowerCase();
        String compare=new StringBuffer(cleanString).reverse().toString();
        return compare.equals(cleanString);
    }
    public static void main(String args[])
    {
        if (isPalindrome(str))
        {
            System.out.println("the string is palindrome");
        }
        else
        {
            System.out.println("the string is not palindrome");
        }
    }
}
