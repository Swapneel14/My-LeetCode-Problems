import java.util.Scanner;

public class Reverse_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(reverseWords(a));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");  // Trim and split by spaces
      StringBuilder result = new StringBuilder();
      
      for (int i = words.length - 1; i >= 0; i--) {
          result.append(words[i]).append(" ");
      }
      
      return result.toString().trim(); 
  }
}