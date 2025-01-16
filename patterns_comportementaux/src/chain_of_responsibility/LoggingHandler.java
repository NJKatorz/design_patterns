package chain_of_responsibility;

// ConcreteHandler3
public class LoggingHandler extends Handler {
  @Override
  protected boolean canHandle(String request) {
    return request.startsWith("LOG");
  }

  @Override
  protected void process(String request) {
    System.out.println("LoggingHandler traite la requête : " + request);
  }
}