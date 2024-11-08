public class Devoir4Chatgpt {
    public static void main(String[] args) {
        // Déclaration des variables
        int year = 2023;  // Remplacez par l'année actuelle
        int month = 10;   // Remplacez par le mois actuel
        int day = 10;     // Remplacez par le jour actuel

        // Vérification des limites de l'année
        if (year < 0 || year > 9999) {
            System.out.println("L'année doit être entre 0 et 9999.");
            return;
        }

        // Vérification des limites du mois
        if (month < 1 || month > 12) {
            System.out.println("Le mois doit être entre 1 et 12.");
            return;
        }

        // Vérification des limites du jour
        boolean validDay = false;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day >= 1 && day <= 31) {
                    validDay = true;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day >= 1 && day <= 30) {
                    validDay = true;
                }
                break;
            case 2:
                // Vérification des années bissextiles
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day >= 1 && day <= 29) {
                        validDay = true;
                    }
                } else {
                    if (day >= 1 && day <= 28) {
                        validDay = true;
                    }
                }
                break;
        }

        if (!validDay) {
            System.out.println("Le jour n'est pas valide pour le mois spécifié.");
            return;
        }

        // Affichage de la date dans un format lisible
        String monthName = "";
        switch (month) {
            case 1: monthName = "Janvier"; break;
            case 2: monthName = "Février"; break;
            case 3: monthName = "Mars"; break;
            case 4: monthName = "Avril"; break;
            case 5: monthName = "Mai"; break;
            case 6: monthName = "Juin"; break;
            case 7: monthName = "Juillet"; break;
            case 8: monthName = "Août"; break;
            case 9: monthName = "Septembre"; break;
            case 10: monthName = "Octobre"; break;
            case 11: monthName = "Novembre"; break;
            case 12: monthName = "Décembre"; break;
        }

        System.out.println("Date valide : " + day + " " + monthName + " " + year);
    }
}

