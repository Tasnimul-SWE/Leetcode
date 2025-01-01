import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        // Initialize the HashMap with Roman numeral values
        HashMap<Character, Integer> r = new HashMap<>();
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);

        int sum = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            // Get the value of the current numeral
            int value1 = r.get(s.charAt(i));
            
            // Check if there is a next numeral and it's larger (handle subtraction cases)
            if (i + 1 < n) {
                int value2 = r.get(s.charAt(i + 1));
                
                if (value1 < value2) {
                    // Subtraction case
                    sum += (value2 - value1);
                    i++; // Skip the next numeral as it's part of the current subtraction case
                } else {
                    // Normal addition case
                    sum += value1;
                }
            } else {
                // Last numeral addition case
                sum += value1;
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman numerals:");
        String input = sc.nextLine();
        Solution obj = new Solution();
        int result = obj.romanToInt(input);
        
        System.out.println("The sum of the Roman numeral values is: " + result);
        
        sc.close();
    }
}