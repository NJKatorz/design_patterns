package observer;

// ConcreteObserverA
public class Ligne implements Observer {
  private int nbrLignes;

  @Override
  public void update(String ligne) {
    nbrLignes++;
  }

  public int getNbrLignes() {
    return nbrLignes;
  }

}
