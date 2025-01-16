package observer;

// ConcreteObserverC
public class Palindrome implements Observer {

  private int nbrPalindromes;


  @Override
  public void update(String ligne) {
    for (String mot : ligne.trim().split(" ")) {
      StringBuffer temp = new StringBuffer(mot);
      if (mot.equals(temp.reverse().toString())) {
        nbrPalindromes++;
      }
    }
  }


  public int getNbrPalindromes() {
    return nbrPalindromes;
  }
}
