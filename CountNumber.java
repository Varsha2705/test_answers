import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        char[] charArray = sentence.toCharArray();
        int wordCount = 0;
        boolean insideWord = false;

        for (char c : charArray) {
            if (c != ' ') {
                if (!insideWord) {
                    wordCount++;
                    insideWord = true;  
                }
            } else {
                insideWord = false;  
            }
        }
        
        System.out.println("Number of words: " + wordCount);
        
       
    }
}
