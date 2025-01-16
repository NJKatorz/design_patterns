package chain_of_responsibility;

public class Main {
  public static void main(String[] args) {
    // Création des gestionnaires
    Handler authHandler = new AuthHandler();
    Handler validationHandler = new ValidationHandler();
    Handler loggingHandler = new LoggingHandler();

    // Configuration de la chaîne
    authHandler.setNext(validationHandler);
    validationHandler.setNext(loggingHandler);

    // Envoi de requêtes
    authHandler.handleRequest("AUTH: Utilisateur connecté");
    authHandler.handleRequest("VALIDATE: Données vérifiées");
    authHandler.handleRequest("LOG: Action enregistrée");
    authHandler.handleRequest("UNKNOWN: Requête inconnue");
  }
}
