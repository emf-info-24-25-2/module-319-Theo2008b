package exercices.exercice08;

public class ExerciceBoucles2
{
    public static void main(String[] args) 
    {
        int d = 5;
        for(int i=0; i<=4;i++)
        System.out.println(+(d--));
        System.out.println("Décollage !!");
        int i=0;
        int e=5;
        while (i<=4) 
        {
            System.out.println(+(e--));
            i++;
        }
        System.out.println("Décollage !!");
        int o=5;
        do 
        {
            System.out.println(+(o));
            o--;
        } while (o>0);
        System.out.println("Décollage !!");
    }

}