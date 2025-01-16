package observer;

// ConcreteObserverD
public class Belgique implements Observer {

  private int nbrBelgique;

  @Override
  public void update(String ligne) {
    if (ligne.contains("Belgique")) {
      nbrBelgique++;
    }
  }

  public int getNbrBelgique() {
    return nbrBelgique;
  }

}
