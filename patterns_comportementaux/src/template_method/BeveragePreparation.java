package template_method;

// AbstractClass
public abstract class BeveragePreparation {
  // Template method
  public final void prepareBeverage() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  // Steps with a default implementation
  private void boilWater() {
    System.out.println("Boiling water...");
  }

  private void pourInCup() {
    System.out.println("Pouring into cup...");
  }

  // Abstract steps to be implemented by subclasses
  public abstract void brew();
  public abstract void addCondiments();
}