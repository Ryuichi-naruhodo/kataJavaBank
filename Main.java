import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prenom;
        String choice;

        System.out.println("Bonjour, pour ouvrir un compte veuillez rensignez votre prénom ");
        prenom = sc.nextLine();
        System.out.println("Bienvenue " + prenom
                + "\nVeuillez écrire \"retirer\" pour retirer de l'argent, \"deposer\" pour déposer de l'argent, \"solde\""
                + " pour consulter votre solde ou \"quitter\" pour arreter toute opération");
        choice = sc.nextLine();
        while (!choice.equals("quitter")) {
            while (!choice.equals("retirer") && !choice.equals("solde") && !choice.equals("deposer")) {
                System.out.println(
                        "Veuillez écrire \"retirer\" pour retirer de l'argent, \"déposer\" pour déposer de l'argent, \"solde\""
                                + " pour consulter votre solde ou \"quitter\" pour arreter toute opération");
                choice = sc.nextLine();
                switch (choice) {
                    case "retirer": {
                        System.out.println("action retirer");
                        break;
                    }
                    case "deposer": {
                        System.out.println("action deposer");
                        break;
                    }
                    case "solde": {
                        System.out.println("action solde");
                        break;
                    }
                    default:
                        break;
                }
            }
        }
        System.out.println("Au revoir !");
    }
}
