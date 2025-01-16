package adapter;

// Client
public class Main {

  public static void main(String[] args) {
    VGA adaptee = new VGA(); // Composant existant
    adaptee.displayVGA();

    System.out.println("----------------------Adaptor--------------------------");
  /**
    // Main
    // + adaptor : Adaptor
    // Le client utilise l'interface HDMI
    HDMI adaptor = new HDMItoVGAAdaptor(vga); // Adaptor
    // HDMItoVGAAdapter adaptor = new HDMItoVGAAdapter(vga); // Adaptor

    // + doWork()
    adaptor.displayHDMI();
     **/
    HDMI adaptor = new HDMItoVGAAdaptor(adaptee);
    Client client = new Client((HDMItoVGAAdaptor) adaptor);
    client.doWork();
  }
}
