package singleton;

// Singleton
public class Singleton {

  // - singleton : Singleton
  private static Singleton instance;

  private String value;

  // - Singleton()
  private Singleton() {}

  // + getInstance() : Singleton
  public static Singleton getInstance() {
    if (instance == null)
      instance = new Singleton();

    return instance;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}