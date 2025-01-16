package chain_of_responsibility;

// ConcreteHandler1
public class AuthHandler extends Handler {
  @Override
  protected boolean canHandle(String request) {
    return request.startsWith("AUTH");
  }

  @Override
  protected void process(String request) {
    System.out.println("AuthHandler traite la requête : " + request);
  }
}
