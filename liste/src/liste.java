import java.util.Scanner;

import static java.lang.Character.toLowerCase;

/**
 * Created by SimMa1733207 on 2018-01-22.
 */
public class liste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbContact = 0;
        int nbTelephone = 0;
        int choixInt;
        char choixChar = 0;
        String input;
        Contact[] tabContact = new Contact[20];
        System.out.println("Bienvenue!");
        while (true) {
            System.out.println();
            System.out.println(" 1- Ajouter un contact");
            System.out.println(" 2- Modifier un contact");
            System.out.println(" 3- Afficher les contacts");
            System.out.println(" 4- Quitter");
            System.out.print("Que souhaitez-vous faire ? ");
            choixInt = sc.nextInt();
            System.out.println();
            switch (choixInt) {
                case 1:
                    nbContact++;
                    tabContact[nbContact - 1]=new Contact();
                    System.out.println("Ce contact sera entré à la position #" + nbContact + ".");
                    System.out.println("Veuillez entrer les informations suivantes :");
                    //CONTACT
                    System.out.print("Prénom : ");
                    tabContact[nbContact - 1].setPrenom(sc.next());
                    System.out.print("Nom : ");
                    tabContact[nbContact - 1].setNom(sc.next());
                    //ADRESSE
                    System.out.println("Adresse :");
                    System.out.print("  Numéro de porte : ");
                    tabContact[nbContact - 1].getAdresse().setNumP(sc.next());
                    System.out.print("  Rue : ");
                    tabContact[nbContact - 1].getAdresse().setRue(sc.next());
                    System.out.print("  Appartement : ");
                    input=sc.nextLine().trim();
                    input=sc.nextLine().trim();
                    if(!input.equals("")) {
                        tabContact[nbContact - 1].getAdresse().setApp(input);
                    }
                    System.out.print("  Ville : ");
                    tabContact[nbContact - 1].getAdresse().setVille(sc.next());
                    System.out.print("  Province : ");
                    tabContact[nbContact - 1].getAdresse().setProvince(sc.next());
                    System.out.print("  Pays :");
                    tabContact[nbContact - 1].getAdresse().setPays(sc.next());
                    //OCCUPATION
                    System.out.println("Occupation : ");
                    System.out.print("  Poste :");
                    tabContact[nbContact - 1].getOccupation().setPoste(sc.next());
                    //ENTREPRISE
                    System.out.println("  Entreprise : ");
                    System.out.print("    Nom : ");
                    tabContact[nbContact - 1].getOccupation().getEntreprise().setNom(sc.next());
                    //ADRESSE
                    System.out.println("    Adresse : ");
                    System.out.print("      Numéro de porte : ");
                    tabContact[nbContact - 1].getOccupation().getEntreprise().getAdresse().setNumP(sc.next());
                    System.out.print("      Rue : ");
                    tabContact[nbContact - 1].getOccupation().getEntreprise().getAdresse().setRue(sc.next());
                    System.out.print("      Appartement : ");
                    input=sc.nextLine().trim();
                    input=sc.nextLine().trim();
                    if(!input.equals("")) {
                        tabContact[nbContact - 1].getOccupation().getEntreprise().getAdresse().setApp(input);
                    }
                    System.out.print("      Ville : ");
                    tabContact[nbContact - 1].getOccupation().getEntreprise().getAdresse().setVille(sc.next());
                    System.out.print("      Province : ");
                    tabContact[nbContact - 1].getOccupation().getEntreprise().getAdresse().setProvince(sc.next());
                    System.out.print("      Pays : ");
                    tabContact[nbContact - 1].getOccupation().getEntreprise().getAdresse().setPays(sc.next());
                    System.out.println();
                    //TELEPHONE
                    while (choixChar != 'n') {
                        System.out.print("Entrer un numéro de téléphone (o/n) ? ");
                        choixChar = toLowerCase(sc.next().charAt(0));
                        if(choixChar=='o'&&tabContact[nbContact - 1].getNbTelephone()<10) {
                            Telephone telephone = new Telephone();
                            tabContact[nbContact - 1].getTelephone()[tabContact[nbContact - 1].getNbTelephone()] = telephone;
                            System.out.print("À quoi correspond ce numéro (cellulaire, maison, travail, …) ? ");
                            tabContact[nbContact - 1].getTelephone()[tabContact[nbContact - 1].getNbTelephone()].setInfo(sc.next());
                            System.out.print("Quel est le numéro ? ");
                            tabContact[nbContact - 1].getTelephone()[tabContact[nbContact - 1].getNbTelephone()].setNum(sc.next());
                            tabContact[nbContact - 1].setNbTelephone(tabContact[nbContact - 1].getNbTelephone() + 1);
                            System.out.println();
                        }
                    }
                    nbTelephone = 0;
                    choixChar = 0;
                    System.out.println("Votre contact a été entré avec succès !");
                    break;
                case 2:
                    choixInt=0;
                    while(choixInt<1||choixInt>20){
                        System.out.println("Quel est le numéro du contact ?");
                        choixInt=sc.nextInt();
                    }
                    if(tabContact[choixInt-1]!=null) {
                        sc.reset();
                        System.out.println("Ce contact sera entré à la position #" + choixInt + ".");
                        System.out.println("Veuillez entrer les informations suivantes :");
                        //CONTACT
                        System.out.print("Prénom (" + tabContact[choixInt - 1].getPrenom() + ") : ");
                        input=sc.nextLine().trim();
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].setPrenom(input);
                        }
                        System.out.print("Nom (" + tabContact[choixInt - 1].getNom() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].setNom(input);
                        }
                        //ADRESSE
                        System.out.println("Adresse : ");
                        System.out.print("  Numéro de porte (" + tabContact[choixInt - 1].getAdresse().getNumP() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getAdresse().setNumP(input);
                        }
                        System.out.print("  Rue (" + tabContact[choixInt - 1].getAdresse().getRue() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getAdresse().setRue(input);
                        }
                        System.out.print("  Appartement (" + tabContact[choixInt - 1].getAdresse().getApp() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getAdresse().setApp(input);
                        }
                        System.out.print("  Ville (" + tabContact[choixInt - 1].getAdresse().getVille() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getAdresse().setVille(input);
                        }
                        System.out.print("  Province (" + tabContact[choixInt - 1].getAdresse().getProvince() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getAdresse().setProvince(input);
                        }
                        System.out.print("  Pays (" + tabContact[choixInt - 1].getAdresse().getPays() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getAdresse().setPays(input);
                        }
                        //OCCUPATION
                        System.out.println("Occupation : ");
                        System.out.print("  Poste (" + tabContact[choixInt - 1].getOccupation().getPoste() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getOccupation().setPoste(input);
                        }
                        //ENTREPRISE
                        System.out.println("  Entreprise : ");
                        System.out.print("    Nom (" + tabContact[choixInt - 1].getOccupation().getEntreprise().getNom() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getOccupation().getEntreprise().setNom(input);
                        }
                        //ADRESSE
                        System.out.println("    Adresse : ");
                        System.out.print("      Numéro de porte (" + tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().getNumP() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().setNumP(input);
                        }
                        System.out.print("      Rue (" + tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().getRue() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().setRue(input);
                        }
                        System.out.print("      Appartement (" + tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().getApp() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().setApp(input);
                        }
                        System.out.print("      Ville (" + tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().getVille() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().setVille(input);
                        }
                        System.out.print("      Province (" + tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().getProvince() + ") : ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().setProvince(input);
                        }
                        System.out.print("      Pays (" + tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().getPays() + "): ");
                        input=sc.nextLine().trim();
                        if(!input.equals("")) {
                            tabContact[choixInt - 1].getOccupation().getEntreprise().getAdresse().setPays(input);
                        }
                        //TELEPHONE
                        System.out.println("Téléphones : ");
                        for (int i = 0; i < tabContact[choixInt - 1].getNbTelephone(); i++) {
                            System.out.print("  " + tabContact[choixInt - 1].getTelephone()[i].getInfo() + " (" + tabContact[choixInt - 1].getTelephone()[i].getNum() + ") : ");
                            input=sc.nextLine().trim();
                            if(!input.equals("")) {
                                tabContact[choixInt - 1].getTelephone()[i].setNum(input);
                            }
                        }
                        System.out.println();
                        while (choixChar != 'n') {
                            System.out.print("Entrer un numéro de téléphone (o/n) ? ");
                            choixChar = toLowerCase(sc.next().charAt(0));
                            if(choixChar == 'o' && tabContact[choixInt - 1].getNbTelephone() <10) {
                                Telephone telephone = new Telephone();
                                tabContact[nbContact - 1].getTelephone()[tabContact[nbContact - 1].getNbTelephone()] = telephone;
                                System.out.print("À quoi correspond ce numéro (cellulaire, maison, travail, …) ? ");
                                tabContact[nbContact - 1].getTelephone()[tabContact[nbContact - 1].getNbTelephone()].setInfo(sc.next());
                                System.out.print("Quel est le numéro ? ");
                                tabContact[nbContact - 1].getTelephone()[tabContact[nbContact - 1].getNbTelephone()].setNum(sc.next());
                                tabContact[nbContact - 1].setNbTelephone(tabContact[nbContact - 1].getNbTelephone() + 1);
                                System.out.println();
                            } else if(choixChar=='o'){
                                System.out.println("ERREUR: Trop de numero");
                            }
                        }
                        nbTelephone=0;
                        choixChar = 0;
                        System.out.println();
                        System.out.println("Votre contact a été modifié avec succès !");
                    }
                    else{
                        System.out.println("ERREUR: Le contact n'existe pas");
                    }
                    break;
                case 3:
                    System.out.println("Vous avez "+nbContact+" contact(s)");
                    System.out.println();
                    for(int i=0;i<nbContact;i++) {
                        System.out.println("Contact #" + (i+1) + " :");
                        System.out.println("------------");
                        //CONTACT
                        System.out.println("Prénom : "+tabContact[i].getPrenom());
                        System.out.println("Nom : "+tabContact[i].getNom());
                        //ADRESSE
                        System.out.println("Adresse : ");
                        System.out.println("  Numéro de porte : "+tabContact[i].getAdresse().getNumP());
                        System.out.println("  Rue : "+tabContact[i].getAdresse().getRue());
                        System.out.println("  Appartement : "+tabContact[i].getAdresse().getApp());
                        System.out.println("  Ville : "+tabContact[i].getAdresse().getVille());
                        System.out.println("  Province : "+tabContact[i].getAdresse().getProvince());
                        System.out.println("  Pays : "+tabContact[i].getAdresse().getPays());
                        //OCCUPATION
                        System.out.println("Occupation : ");
                        System.out.println("  Poste : "+tabContact[i].getOccupation().getPoste());
                        //ENTREPRISE
                        System.out.println("  Entreprise : ");
                        System.out.println("    Nom : "+tabContact[i].getOccupation().getEntreprise().getNom());
                        //ADRESSE
                        System.out.println("    Adresse : ");
                        System.out.println("      Numéro de porte : "+tabContact[i].getOccupation().getEntreprise().getAdresse().getNumP());
                        System.out.println("      Rue : "+tabContact[i].getOccupation().getEntreprise().getAdresse().getRue());
                        System.out.println("      Appartement : "+tabContact[i].getOccupation().getEntreprise().getAdresse().getApp());
                        System.out.println("      Ville : "+tabContact[i].getOccupation().getEntreprise().getAdresse().getVille());
                        System.out.println("      Province : "+tabContact[i].getOccupation().getEntreprise().getAdresse().getProvince());
                        System.out.println("      Pays : "+tabContact[i].getOccupation().getEntreprise().getAdresse().getPays());
                        //TELEPHONE
                        System.out.println("Téléphones : ");
                        for(int j=0;j<tabContact[i].getNbTelephone();j++){
                            System.out.println("  "+tabContact[i].getTelephone()[j].getInfo()+" : "+tabContact[i].getTelephone()[j].getNum());
                        }
                        System.out.println();
                    }
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

