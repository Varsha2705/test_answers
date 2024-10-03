import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        char[] charArray = sentence.toCharArray();
        int wordCount = 0;
        int i = 0;

        
        while (i < charArray.length) {
            if (charArray[i] != ' ') {
                wordCount++;
                while (i < charArray.length && charArray[i] != ' ') {
                    i++;
                }
            } else {
                i++;
            }
        }

        System.out.println("Total words: " + wordCount);

        scanner.close();
    }
}