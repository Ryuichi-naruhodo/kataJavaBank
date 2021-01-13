import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        double input;
        String prenom;
        String choice = new String();

        System.out.println("Bonjour, pour ouvrir un compte veuillez rensignez votre prénom ");
        prenom = sc.nextLine();
        System.out.println("Bienvenue " + prenom);

        while (!choice.equals("retirer") || !choice.equals("solde") || !choice.equals("deposer")
                || !choice.equals("quitter")) {
            System.out.println(
                    "Veuillez écrire \"retirer\" pour retirer de l'argent, \"deposer\" pour déposer de l'argent, \"solde\""
                            + " pour consulter votre historique ou \"quitter\" pour arreter toute opération");
            choice = sc.next();

            switch (choice) {
                case "retirer": {
                    System.out.println("Combien souhaitez-vous retirer ?");
                    try {
                        input = sc.nextInt();
                        account.balance = account.withdrawal(input);
                        System.out.println(
                                "Vous avez deposez " + input + "€, il vous reste " + account.getBalance() + "€");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Le montant n'est pas valide, vous allez être redirigé à l'accueil");
                    }
                    break;
                }
                case "deposer": {
                    System.out.println("Combien souhaitez-vous déposer ?");
                    try {
                        input = sc.nextInt();
                        account.balance = account.deposit(input);
                        System.out.println(
                                "Vous avez deposez " + input + "€, il vous reste " + account.getBalance() + "€");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Le montant n'est pas valide, vous allez être redirigé à l'accueil");
                    }
                    break;
                }
                case "solde": {
                    account.printSolde();
                    break;
                }
                case "quitter": {
                    System.out.println("Au revoir !");
                    return;
                }
                default:
                    break;
            }
        }
    }
}
