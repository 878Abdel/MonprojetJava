import  java.util.Scanner;
public class entréeStandard {
    public static void main(String[] args) {

        System.out.println("Bienvenue à Unipro !");
        Scanner Scan = new Scanner(System.in);
        System.out.println("Veuillez saisir votre prénom : ");
        String userFirstname = Scan.next();
        System.out.println("Veuillez saisir votre nom: ");
        String userLastname = Scan.next();
        System.out.println("Saisissez votre Age : ");
        int userage = Scan.nextInt();
        Scan.nextLine();
        System.out.println("Saisissez votre Filiére : ");
        String filierre = Scan.next();
        System.out.println("Merci, " + userFirstname + " " + userLastname + " vous dites avoir "
                + userage +"ans" + " Vous etes inscrit en " + filierre + " Veuilliez confirmer par Oui si les information sont correctes ");

    }
}


