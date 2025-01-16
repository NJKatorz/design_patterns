package observer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AnalyseurDeTexte implements AnalyseurDeTxt{
	List<Observer> observers = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		AnalyseurDeTexte analyseur = new AnalyseurDeTexte();

		Ligne ligne = new Ligne();
		Mot mot = new Mot();
		Palindrome palindrome = new Palindrome();
		Belgique belgique = new Belgique();

		analyseur.addObservateur(ligne);
		analyseur.addObservateur(mot);
		analyseur.addObservateur(palindrome);
		analyseur.addObservateur(belgique);

		analyseur.lireFichier();

		System.out.println("Il y avait "+ligne.getNbrLignes()+" lignes.");
		System.out.println("Il y avait "+mot.getNbrMots()+" mots.");
		System.out.println("Il y avait "+palindrome.getNbrPalindromes()+" palindromes.");
		System.out.println("Il y avait "+belgique.getNbrBelgique()+
				" lignes contenant Belgique.");
	}


	@Override
	public void addObservateur(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void removeObservateur(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObservateur(String ligne) {
		for(Observer obs: observers) {
			obs.update(ligne);
		}
	}

	public void lireFichier() throws IOException {
		BufferedReader lecteurAvecBuffer=null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(
					new FileReader("file.txt"));
		} catch(FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {

			notifyObservateur(ligne);
		}

		lecteurAvecBuffer.close();
	}


}
