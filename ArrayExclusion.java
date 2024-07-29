import java.util.ArrayList;

public class ArrayExclusion {
    public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();

      names.add("John");
      names.add("Jane");
      names.add("Doe");

      names.remove("Jane");

      System.out.println("List after deletion: ");
      for(String name : names) {
        System.out.println(name);
      }
    }
}