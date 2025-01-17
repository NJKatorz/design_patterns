package template_method;

// ConcreteClass 1: Tea Preparation
public class TeaPreparation extends BeveragePreparation {
  @Override
  public void brew() {
    System.out.println("Steeping the tea...");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding lemon...");
  }
}