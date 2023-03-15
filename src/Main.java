import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int guessCount = 0, predictedNumber, randomNumber, score = 0;
    boolean isContinue = true;

    randomNumber = (int) (Math.random() * 100) + 1;
    Scanner scanner = new Scanner(System.in);

    while (isContinue) {
      System.out.print("1-100 arasında bir sayı giriniz: ");
      predictedNumber = scanner.nextInt();
      if (predictedNumber < 1 || predictedNumber > 100) {
        continue;
      }
      guessCount++;
      if (predictedNumber == randomNumber) {
        score += calculateScore(guessCount);
        System.out.println("##########################################");
        System.out.println("# Tebrikler sayıyı bildiniz, " + guessCount + " tahminde bildiniz, Skorunuz: " + score);
        System.out.println("##########################################");
        System.out.print("Tekrar oynamak ister misiniz? E/H ");
        char playAgain = scanner.next().charAt(0);
        if (playAgain == 'H' || playAgain == 'h') {
          isContinue = false;
        } else {
          guessCount = 0;
          randomNumber = (int) (Math.random() * 100) + 1;
        }
      } else if (predictedNumber < randomNumber) {
        System.out.println("Too low try again.");
      } else {
        System.out.println("Too high try again.");
      }
      System.out.println();
    }
  }

  public static int calculateScore(int guessCount) {
    if (guessCount < 5) {
      return 20;
    } else if (guessCount < 10) {
      return 10;
    } else {
      return 1;
    }
  }
}