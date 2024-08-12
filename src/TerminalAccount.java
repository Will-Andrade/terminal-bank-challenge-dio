import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    try {
      System.out.println("Please input your full name!");
      String fullName = scanner.nextLine();
      
      if (!isAPureString(fullName)) {
        throw new IllegalArgumentException("Invalid input for full name. Please, input " +
            "a string with your name.");
      }
      
      System.out.println("Please input the agency number!");
      
      if (!scanner.hasNextInt()) {
        throw new IllegalArgumentException("Invalid input for agency number. Please, " +
            "input a valid agency integer number.");
      }
      
      int agencyNumber = scanner.nextInt();
      
      System.out.println("Please input the account number!");
      
      if (!scanner.hasNextInt()) {
        throw new IllegalArgumentException("Invalid input for account number. Please " +
            "input a valid integer account number.");
      }
      
      int accountNumber = scanner.nextInt();
      
      System.out.println("Please input your balance!");
      
      if (!scanner.hasNextDouble()) {
        throw new IllegalArgumentException("Invalid input for balance. Please, input a " +
            "double");
      }
      
      double balance = scanner.nextDouble();
      
      System.out.println("Hello " + fullName + ", thank you for creating an account in " +
          "our bank, your agency is " + agencyNumber + ", account " + accountNumber +
          " and your balance " + balance + " is already available for withdraw.");
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    } finally {
      scanner.close();
    }
  }
  
  public static boolean isAPureString(String str) {
    return str.matches("^[a-zA-Z]+([\\s][a-zA-Z]+)*$");
  }
}
