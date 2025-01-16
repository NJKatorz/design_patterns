package chain_of_responsibility;

// Handler
public abstract class Handler {
  private Handler next;

  // Permet de définir le prochain gestionnaire dans la chaîne
  public void setNext(Handler next) {
    this.next = next;
  }

  // Méthode pour traiter la requête
  public void handleRequest(String request) {
    if (canHandle(request)) {
      process(request);
    } else if (next != null) {
      next.handleRequest(request); // Passe au prochain gestionnaire
    } else {
      System.out.println("Aucun gestionnaire n'a pu traiter la requête : " + request);
    }
  }

  // Méthodes à implémenter par les gestionnaires concrets
  protected abstract boolean canHandle(String request);
  protected abstract void process(String request);
}

