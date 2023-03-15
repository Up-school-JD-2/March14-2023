import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Bir kelime giriniz:  ");
      String word = scanner.next();

      String reverseWord = reverse(word);

      System.out.println("Kelimenin ters çevrilmiş hali: " + reverseWord);

      if (word.equalsIgnoreCase(reverseWord)) {
        System.out.println(word + " kelimesi bir polindrom kelimedir");
      } else {
        System.out.println(word + " kelimesi bir polindrom kelime değildir.");
      }
      boolean isSame = isSame(word, reverseWord);

      if (isSame) {
        System.out.println(word + " kelimesi bir polindrom kelimedir");
      } else {
        System.out.println(word + " kelimesi bir polindrom kelime değildir.");
      }
    }
  }

  public static String reverse(String word) {
    String reversedWord = StringUtils.EMPTY_STRING;
    for (int i = word.length() - 1; i >= 0; i--) {
      reversedWord += word.charAt(i);
    }
    return reversedWord;
  }

  public static boolean isSame(String firstWord, String secondWord) {
    firstWord = firstWord.toLowerCase();
    secondWord = secondWord.toLowerCase();

    if (firstWord.length() != secondWord.length()) {
      return false;
    }
    for (int i = 0; i < firstWord.length(); i++) {
      if (firstWord.charAt(i) != secondWord.charAt(i)) {
        return false;
      }
    }
    return true;
  }
}
// kayak
// firstWord = word.toLowerCase();
// firstWord.equals(secondWord.toLowerCase())