package strategy;

// Main
public class Main {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    cart.setTaxStrategy(new USTax());
    System.out.println("Total with US tax: " + cart.calculateTotal(100));

    cart.setTaxStrategy(new CanadaTax());
    System.out.println("Total with Canada tax: " + cart.calculateTotal(100));

    cart.setTaxStrategy(new FranceTax());
    System.out.println("Total with France tax: " + cart.calculateTotal(100));
  }
}
