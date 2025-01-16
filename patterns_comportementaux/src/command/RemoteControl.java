package command;

// Invoker
public class RemoteControl {
  // private Command command;
  private Command button1;
  private Command button2;

  public RemoteControl(Command button1, Command button2) {
    this.button1 = button1;
    this.button2 = button2;
  }

  public void pressButton1() {
    button1.execute();
  }

  public void pressUndo1() {
    button1.undo();
  }

  public void pressButton2() {
    button2.execute();
  }

  public void pressUndo2() {
    button2.undo();
  }
}
