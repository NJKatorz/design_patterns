package strategy;

// ConcreteStrategy1: US Tax
public class USTax implements TaxStrategy {
  @Override
  public double calculateTax(double amount) {
    return amount * 0.07; // 7% tax
  }
}
