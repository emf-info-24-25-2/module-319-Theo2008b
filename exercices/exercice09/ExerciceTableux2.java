package exercices.exercice09;

public class ExerciceTableux2 {
    public static void main(String[] args) {
        int[] tableauBlo = new int[10];
    
        int valeurAleatoire;
        for (int i=0 ; i < tableauBlo.length;i++){
            valeurAleatoire = (int) (Math.random() * 6) + 1;
            System.out.println("Cellule "+i+": "+valeurAleatoire);
        }
    }
}
