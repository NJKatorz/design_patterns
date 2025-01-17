package template_method;

// ConcreteClass 2: Coffee Preparation
public class CoffeePreparation extends BeveragePreparation {
  @Override
  public void brew() {
    System.out.println("Brewing the coffee...");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding sugar and milk...");
  }
}
