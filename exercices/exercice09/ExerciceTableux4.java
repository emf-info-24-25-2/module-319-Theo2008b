package exercices.exercice09;

import java.util.Scanner;

public class ExerciceTableux4 {
    public static void main(String[] args) {
        // Scanner pour lire le nombre de départ
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur d'entrer un nombre de départ
        System.out.print("Entrez un nombre de départ : ");
        int nombreDepart = scanner.nextInt();
        
        // Création du tableau pour contenir les 5 nombres suivants
        int[] tableau = new int[5];
        
        // Remplissage du tableau avec les 5 nombres suivants
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = nombreDepart + i + 1;  // Ajoute i + 1 au nombre de départ
        }
        
        // Affichage du contenu du tableau
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Cellule " + i + " : " + tableau[i]);
        }
        
        // Fermeture du scanner
        scanner.close();
    }
}
