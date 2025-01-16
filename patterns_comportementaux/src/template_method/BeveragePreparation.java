package template_method;

// AbstractClass
abstract class BeveragePreparation {
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
  protected abstract void brew();
  protected abstract void addCondiments();
}