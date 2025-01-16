package strategy;

// ConcreteStrategy3: France Tax
public class FranceTax implements TaxStrategy {
  @Override
  public double calculateTax(double amount) {
    return amount * 0.20; // 20% VAT
  }
}
