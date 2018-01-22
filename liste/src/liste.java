import java.util.Scanner;

import static java.lang.Character.toLowerCase;

/**
 * Created by SimMa1733207 on 2018-01-22.
 */
public class liste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choixInt;
        int nbContact = 0;
        char choixChar = 0;
        Contact[] tabContact = new Contact[20];
        System.out.println("Bienvenue!");
        while (true) {
            System.out.println(" 1- Ajouter un contact");
            System.out.println(" 2- Modifier un contact");
            System.out.println(" 3- Afficher les contacts");
            System.out.println(" 4- Quitter");
            System.out.print("Que souhaitez-vous faire ? ");
            choixInt = sc.nextInt();
            switch (choixInt) {
                case 1:
                    nbContact++;
                    System.out.println("Ce contact sera entré à la position #" + nbContact + ".");
                    System.out.println("Veuillez entrer les informations suivantes :");
                    //CONTACT
                    System.out.println("Prénom : ");
                    tabContact[nbContact - 1].setPrenom(sc.next());
                    System.out.println("Nom : ");
                    tabContact[nbContact - 1].setNom(sc.next());
                    //ADRESSE
                    System.out.println("Adresse :");
                    System.out.println("  Numéro de porte : ");
                    tabContact[nbContact - 1].getAdresse().setNumP(sc.next());
                    System.out.println("  Rue : ");
                    tabContact[nbContact - 1].getAdresse().setRue(sc.next());
                    System.out.println("  Appartement : ");
                    tabContact[nbContact - 1].getAdresse().setApp(sc.next());
                    System.out.println("  Ville : ");
                    tabContact[nbContact - 1].getAdresse().setVille(sc.next());
                    System.out.println("  Province : ");
                    tabContact[nbContact - 1].getAdresse().setProvince(sc.next());
                    System.out.println("  Pays :");
                    tabContact[nbContact - 1].getAdresse().setPays(sc.next());
                    //OCCUPATION
                    System.out.println("Occupation : ");
                    System.out.println("  Poste :");
                    tabContact[nbContact - 1].getOccupation().setPoste(sc.next());
                    //ENTREPRISE
                    System.out.println("  Entreprise : ");
                    System.out.println("    Nom : ");
                    tabContact[nbContact - 1].getEntreprise().setNom(sc.next());
                    //ADRESSE
                    System.out.println("    Adresse : ");
                    System.out.println("      Numéro de porte : ");
                    tabContact[nbContact - 1].getEntreprise().getAdresse().setNumP(sc.next());
                    System.out.println("      Rue : ");
                    tabContact[nbContact - 1].getEntreprise().getAdresse().setRue(sc.next());
                    System.out.println("      Appartement : ");
                    tabContact[nbContact - 1].getEntreprise().getAdresse().setApp(sc.next());
                    System.out.println("      Ville : ");
                    tabContact[nbContact - 1].getEntreprise().getAdresse().setVille(sc.next());
                    System.out.println("      Province : ");
                    tabContact[nbContact - 1].getEntreprise().getAdresse().setProvince(sc.next());
                    System.out.println("      Pays : ");
                    tabContact[nbContact - 1].getEntreprise().getAdresse().setPays(sc.next());
                    //TELEPHONE
                    while (choixChar != 'n') {
                        System.out.print("Entrer un numéro de téléphone (o/n) ? ");
                        choixChar = toLowerCase(sc.next().charAt(0));
                        System.out.print("À quoi correspond ce numéro (cellulaire, maison, travail, …) ? ");
                        tabContact[nbContact - 1].getTelephone().setInfo(sc.next());
                        System.out.print("Quel est le numéro ? ");
                        tabContact[nbContact - 1].getTelephone().setNum(sc.next());
                    }
                    choixChar = 0;
                    System.out.println("Votre contact a été entré avec succès !");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERREUR: Entrez un choix valide (entre 1 et 4)");
                    break;
            }

        }
    }
}

