package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		//Inizializzazione delle variabili
		//String nome = "Cosimo";
		//String cognome = "Loiodice";
		//String colorePreferito = "giallo";
		//Anno di nascita
		//int giorno = 8;
		//int mese = 5;
		//int anno = 2009;
		
		//Acquisizione dei dati da tastiera
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire il nome");
		String nome = input.nextLine();
		System.out.println("Il nome è " + nome);
		
		System.out.println("Inserire il cognome");
		String cognome = input.nextLine();
		System.out.println("Il cognome è " + cognome);
		
		System.out.println("Inserire il colorePreferito");
		String colorePreferito = input.nextLine();
		System.out.println("Il colorePreferito è " + colorePreferito);
		
		System.out.println("Inserire il giorno di nascita");
		int giorno = input.nextInt();
		System.out.println("Il giorno di nascita è " + giorno);
				
		System.out.println("Inserire il mese di nascita");
		int mese = input.nextInt();
		System.out.println("Il mese di nascita è " + mese);
		
		System.out.println("Inserire l'anno di nascita");
		int anno = input.nextInt();
		System.out.println("L'anno di nascita è " + anno);
		
		int somma = giorno + mese + anno;
		String password = nome + "-" + cognome + "-" +  colorePreferito + "-" +  somma;	//esegue la conversione della variabile somma	
		System.out.println("La password è: " + password);  //stampa la stringa
	}
}
