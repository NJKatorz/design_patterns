package singleton;

public class Main {

  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    singleton1.setValue("ooo");

    System.out.println(singleton1.getValue() + " " + singleton2.getValue());
    // true, les deux références pointent vers la même instance
  }
}