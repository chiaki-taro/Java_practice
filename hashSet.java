import java.util.HashSet;

public class hashSet {
  public static void main(String[] args) {
    
    String[] items = {"apple", "banana", "apple", "orange"};

    HashSet<String> uniqueItems = new HashSet<>();

    for(String item : items) {
      uniqueItems.add(item);
    }

    System.out.println("uniqueItems:");
    for (String item : uniqueItems) {
      System.out.println(item);
    }

  }
  
}