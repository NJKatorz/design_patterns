package template_method;

// ConcreteClass 1: Tea Preparation
class TeaPreparation extends BeveragePreparation {
  @Override
  protected void brew() {
    System.out.println("Steeping the tea...");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding lemon...");
  }
}