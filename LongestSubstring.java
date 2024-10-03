public class LongestSubstring {
    public static void main(String[] args) {
        String A = "tutorialhorizon";
        String B = "dynamictutorialProgramming";
        
        int maxLength = 0;

        
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                int length = 0;

               
                while (i + length < A.length() && j + length < B.length() &&
                       A.charAt(i + length) == B.charAt(j + length)) {
                    length++; 
                }

               
                maxLength = Math.max(maxLength, length);
            }
        }

        System.out.println("Length of Longest Common Substring: " + maxLength);
    }
}