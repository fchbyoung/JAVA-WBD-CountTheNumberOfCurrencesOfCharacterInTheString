import java.util.Scanner;

public class CountTheNumberOfCurrencesOfCharacterInTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
        System.out.println("Enter a character ");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
          if(character == str.charAt(i)) {
              count++;
          }
        }
        System.out.println("Count = " + count);

    }

}
