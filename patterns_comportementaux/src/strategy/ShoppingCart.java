package strategy;

// Context
public class ShoppingCart {
  private TaxStrategy taxStrategy;

  // Set the strategy dynamically
  public void setTaxStrategy(TaxStrategy taxStrategy) {
    this.taxStrategy = taxStrategy;
  }

  public double calculateTotal(double amount) {
    return amount + taxStrategy.calculateTax(amount);
  }
}