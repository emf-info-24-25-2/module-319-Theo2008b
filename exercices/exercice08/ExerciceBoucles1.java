package exercices.exercice08;

public class ExerciceBoucles1
{
    public static void main(String[] args) 
    {
        for(int i=0; i<=4;i++)
        System.out.println("Boucle for, itération "+(i+1));
        int i=0;
        while (i<=4) 
        {
            System.out.println("Boucle while, itération "+(i+1));
            i++;
        }
        int o=0;
        do 
        {
            System.out.println("Boucle do-while, itération "+(o+1));
            o++;
        } while (o<=4);
    }

}