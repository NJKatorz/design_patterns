package chain_of_responsibility;

// ConcreteHandler2
public class ValidationHandler extends Handler {
  @Override
  protected boolean canHandle(String request) {
    return request.startsWith("VALIDATE");
  }

  @Override
  protected void process(String request) {
    System.out.println("ValidationHandler traite la requête : " + request);
  }
}