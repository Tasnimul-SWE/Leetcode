import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        String str1= Integer.toString(x);
        String str2 = "";
        
        for(int i= str1.length()-1; i>=0; i--)
        {
            str2+= str1.charAt(i);
        }
        
        return str1.equals(str2);
    }
    
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input");
        int x= sc.nextInt();
        Solution obj = new Solution();
        //System.out.println("enter input");
        boolean result = obj.isPalindrome(x);
        System.out.println(result);
    }
}