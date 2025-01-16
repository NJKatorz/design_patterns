package template_method;

// ConcreteClass 2: Coffee Preparation
class CoffeePreparation extends BeveragePreparation {
  @Override
  protected void brew() {
    System.out.println("Brewing the coffee...");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding sugar and milk...");
  }
}
