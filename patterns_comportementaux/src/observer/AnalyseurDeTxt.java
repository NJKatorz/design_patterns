package observer;

// Subject
public interface AnalyseurDeTxt {
  void addObservateur(Observer obs);

  void removeObservateur(Observer obs);

  void notifyObservateur(String ligne);
}
