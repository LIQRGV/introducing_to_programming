import java.util.Scanner;

public class InputOutput{
  public static void main(String argc[])
  {
    String kata;
    Scanner scanner = new Scanner(System.in);

    kata = scanner.next();
    System.out.print("Tadi, kamu menulis : ");
    System.out.println(kata);
  }
}
