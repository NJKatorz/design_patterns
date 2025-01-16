package template_method;

public class Main {
  public static void main(String[] args) {
    BeveragePreparation tea = new TeaPreparation();
    tea.prepareBeverage();

    System.out.println();

    BeveragePreparation coffee = new CoffeePreparation();
    coffee.prepareBeverage();

  }
}
