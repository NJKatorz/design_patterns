package observer;

// Subject (interface)
public interface AnalyseurDeTxt {
  void addObservateur(Observer obs);

  void removeObservateur(Observer obs);

  void notifyObservateur(String ligne);
}
