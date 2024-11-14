public class Devoir04 {
    public static void main(String[] args) {
        int year = 2024;
        int month =2;
        int day = 30;
        //RIF: faites les choses dans l'ordre! Si vous regardez les résulat attendu il faut:
        // 1. afficher la date entrée
        // 2. vérifier si le jour / mois / année est plausible 
        //    vous pouvez par exemple commencer par l'année (>0 et < 9999), si pas ok afficher le message d'erreur
        //    si ok vérifiez le mois (>0 et <13), si pas ok afficher le message d'erreur
        //    si ok faites votre switch sur le mois et dedans vérifiez le jour (>0 et < jour max), si pas ok afficher le message d'erreur
        // 3. et finalement toujours dans le switch si tout est ok, afficher la date comme vous l'avez fait
    

        switch (month) {
            case 1:
                System.out.println("Le "+day+" Janvier "+year);
                break;
        
            case 2:
                System.out.println("Le "+day+" Février "+year);
                break;
            case 3:
                System.out.println("Le "+day+" Mars "+year);
                break;
            case 4:
                System.out.println("Le "+day+" Avril "+year);
                break;
            case 5:
                System.out.println("Le "+day+" Mai "+year);
                break;
            case 6:
                System.out.println("Le "+day+" Juin "+year);
                break;
            case 7:
                System.out.println("Le "+day+" Juillet "+year);
                break;
            case 8:
                System.out.println("Le "+day+" Août "+year);
                break;
            case 9:
                System.out.println("Le "+day+" Septembre "+year);
                break;
            case 10:
                System.out.println("Le "+day+" Octobre "+year);
                break;
            case 11:
                System.out.println("Le "+day+" Novembre "+year);
                break;
            case 12:
                System.out.println("Le "+day+" Décembre "+year);
                break;

        }
    }
}
