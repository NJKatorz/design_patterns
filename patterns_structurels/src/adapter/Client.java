package adapter;

// Client
public class Client {
  // + adaptor : Adaptor
  private HDMItoVGAAdaptor adaptor;

  public Client(HDMItoVGAAdaptor adaptor) {
    this.adaptor = adaptor;
  }

  // + doWork()
  public void doWork(){
    adaptor.displayHDMI();
  }

}
