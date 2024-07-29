import java.util.HashMap;
import java.util.Scanner;

public class SearchAddress {
  public static void main(String[] args) {

    HashMap<String, String> emailAddresses = new HashMap<>();
    emailAddresses.put("John", "john@example.com");
    emailAddresses.put("Jane", "jane@examnple.com");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a name to find the email address");
    String inputName = scanner.nextLine();

    if (emailAddresses.containsKey(inputName)) {
      System.out.println("Email address" + emailAddresses.get(inputName));
    } else {
      System.out.println("No entry found");
    }

    scanner.close();

  }
  
}
