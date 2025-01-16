package strategy;

// ConcreteStrategy2: Canada Tax
public class CanadaTax implements TaxStrategy {
  @Override
  public double calculateTax(double amount) {
    return amount * 0.05; // 5% tax
  }
}