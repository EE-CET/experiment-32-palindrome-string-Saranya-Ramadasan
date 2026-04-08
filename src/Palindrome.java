import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        
        String s = sc.nextLine();
        
        if (isPalindrome(s)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        sc.close();
    }

    public static boolean isPalindrome(String s) {
        // Convert to lowercase to ensure case-insensitivity
        s = s.toLowerCase();
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
