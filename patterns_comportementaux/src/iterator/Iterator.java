package iterator;

// Iterator
public interface Iterator<T> {
  boolean hasNext(); // Vérifie s'il reste des éléments
  T next();          // Renvoie l'élément suivant
}