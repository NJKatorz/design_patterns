package command;

// Client
public class Main {
  public static void main(String[] args) {
    // Receiver
    Light livingRoomLight = new Light();

    // Commands
    Command lightOn = new TurnOnLightCommand(livingRoomLight);
    Command lightOff = new TurnOffLightCommand(livingRoomLight);

    // Invoker
    RemoteControl remote = new RemoteControl(lightOn, lightOff);

    // Turn the light ON
    remote.pressButton1();

    // Undo the command and turn the light OFF
    remote.pressUndo1();

    // Turn the light OFF
    remote.pressButton2();

    // Undo the command
    remote.pressUndo2();
  }
}
