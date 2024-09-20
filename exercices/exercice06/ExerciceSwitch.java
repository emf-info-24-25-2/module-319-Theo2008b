package exercices.exercice06;
public class ExerciceSwitch
{
    public static void main(String[] args) 
    {
        int note = 5;

        if (note<4) 
        {
            System.out.println("Ma note est insuffisante.");
        }
        else 
        {
            System.out.println("Ma note est suffisante.");
        }
        System.out.println("Ma note est : "+ note);


        switch (note) 
        {
            case 1:
                System.out.println("J'ai triché, c'est mal!");
                break;
            case 2:
                System.out.println("Y a du boulot!");
                break;
            case 3:
                System.out.println("Encore un effort!");
                break;
            case 4:
                System.out.println("Juste juste!");
                break;
            case 5:
                System.out.println("Bien!");
                break;
            case 6:
                System.out.println("Très bien!");
            default:
            System.out.println("Note incohérente...");
                break;
        }
    }
}