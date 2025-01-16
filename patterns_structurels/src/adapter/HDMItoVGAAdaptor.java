package adapter;

// Adaptor
public class HDMItoVGAAdaptor implements HDMI {
  private VGA vga;

  public HDMItoVGAAdaptor(VGA vga) {
    this.vga = vga;
  }

  // methodA()
  @Override
  public void displayHDMI() {
    // Appelle la méthode VGA sous le capot
    vga.displayVGA();
  }
}