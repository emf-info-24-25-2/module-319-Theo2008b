package devoirs.devoir07;

public class devoir07 {
    final int TAILLE_TABLEAU = 10;
    final int MIN_NOMBRE = -8;
    final int MAX_NOMBRE = +8;
    final int VALEUR_RACHERCHEE = 7;
    static int valeurAleatoire = 0;
public static int[] ValeursAleoatoires0(int TAILLE_TABLEAU, int MIN_NOMBRE, int MAX_NOMBRE) {
    int[] tableau = new int[TAILLE_TABLEAU];
    for (int i =0 ; i < tableau.length;i++) {
        valeurAleatoire = (int) (Math.random());
        System.out.println("Cellule "+i+": "+valeurAleatoire);

    }
    return tableau;
}

    public static void main(String[] args) {
        
    }
}
