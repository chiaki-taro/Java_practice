import java.util.HashMap;
import java.util.Map;

public class hashMap {

  public static void main(String[] args) {
    
    HashMap<String, Integer> fruitStock = new HashMap<>();
    fruitStock.put("apple", 5);
    fruitStock.put("banana", 2);
    fruitStock.put("orange", 8);

    System.out.println("FruitStock:");
    for (Map.Entry<String, Integer> entry : fruitStock.entrySet()) {
      System.out.println(entry.getKey() + "=" + entry.getValue());
    }

  }
  
}
