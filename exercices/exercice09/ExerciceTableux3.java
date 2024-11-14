package exercices.exercice09;

public class ExerciceTableux3 {
    public static void main(String[] args) {
        int[] tableauBlo = new int[10];
    
        int valeurAleatoire;
        double somme = 0;
        for (int i=0 ; i < tableauBlo.length;i++){
            valeurAleatoire = (int) (Math.random() * 6) + 1;
            System.out.println("Cellule "+i+": "+valeurAleatoire);
            somme += valeurAleatoire;
        }
        double moyenne = (double) somme / tableauBlo.length;
        System.out.println("La moyenne des valeurs du tableau est : " + moyenne);
    }
}
