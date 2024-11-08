package exercices.exercice12;

public class ExercicesString {
    public static void main(String[] args) {
        String maChaineDeCaractereString = "Voici du contenu stocké dans un String.";
        int NBRDeCaractere = maChaineDeCaractereString.length();
        System.out.println("Nombre de caractères dans la variable maChaineDeCaractereString : "+NBRDeCaractere);
        int positionContenu = maChaineDeCaractereString.indexOf("contenu");
        System.out.println("Le mot \"contenu\" commence à la position : "+positionContenu);
        char lettrePosition10 = maChaineDeCaractereString.charAt(10);
        System.out.println("Le position 10 contient la lettre : " + lettrePosition10);
        String monPrenom = "Théo";
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }
    }
}