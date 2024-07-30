public class Person {
    private String name;
    private static int age;
    
    public Person (String name, int age) {
      this.name = name;
      this.age = age;
    }

    public void selfIntroduction() {
        System.out.println("I'm " + name + ". I'm " + age + " years old.");
    }
}
