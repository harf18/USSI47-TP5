package net.lecnam.ussi2a.tp5;

import java.util.Scanner;

public class Exec {

    private static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Que voulez vous faire ? ");
            System.out.println("1. Ajouter un rectangle ");
            System.out.println("2. Quitter");
            try {
                int choix = Integer.parseInt(sc.nextLine());
                if (choix == 1) {
                    ajoutRectangle(sc);
                    afficheDessin();
                } else if (choix == 2) {
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Saisir 1 ou 2 seulement");
            }

        }

    }

    private static void afficheDessin() {
        System.out.println("Plus grand rectangle : " + dessin.retournePlusGrand());
        System.out.println("Surface totale : " + dessin.retourneSurfaceTotale());
        System.out.println("Périmètre total : " + dessin.retournePerimetreTotale());
    }

    private static void ajoutRectangle(Scanner sc) {
        System.out.println("Abscisse point :");
        double x = Double.parseDouble(sc.nextLine());

        System.out.println("Ordonnée point :");
        double y = Double.parseDouble(sc.nextLine());

        System.out.println("Longueur :");
        double longueur = Double.parseDouble(sc.nextLine());

        System.out.println("Largeur :");
        double largeur = Double.parseDouble(sc.nextLine());

        dessin.ajout(new Rectangle(longueur, largeur, x, y));

    }

}
