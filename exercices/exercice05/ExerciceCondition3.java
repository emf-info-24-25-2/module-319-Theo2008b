package exercices.exercice05;

public class ExerciceCondition3 
{
    public static void main(String[] args) 
    {
        int valeur1 = 3;
        int valeur2 = 6;
        int valeur3 = valeur1*valeur2;
        if (valeur3 % 2 == 0) 
        {
            System.out.println("Le résultat est positif");    
        } else {
            System.out.println("Le résultat est négatif");
        }
        System.out.println("Le résultat est "+valeur3);
    }
}
