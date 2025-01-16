package observer;

// ConcreteObserverB
public class Mot implements Observer {
  private int nbrMots;

  @Override
  public void update(String ligne) {
    nbrMots += ligne.trim().split(" ").length;
  }

  public int getNbrMots() {
    return nbrMots;
  }

}
