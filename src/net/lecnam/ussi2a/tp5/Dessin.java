package net.lecnam.ussi2a.tp5;

public class Dessin {

    Rectangle[] figures = new Rectangle[100];
    int nbFigures = 0;

    public void ajout(Rectangle figure){
        figures[nbFigures]=figure;
        nbFigures++;
    }

    public double retourneSurfaceTotale(){
        double total = 0;
        for (Rectangle fig: figures) {
            if (fig == null) {
                continue;
            }
            total += fig.retourneSurface();
        }
        return total;
    }

    public double retournePerimetreTotale(){
        double total = 0;
        for (Rectangle fig: figures) {
            if (fig == null) {
                continue;
            }
            total += fig.retournePerimetre();
        }
        return total;
    }

    public void translate(double x, double y){

        for (Rectangle fig : figures) {
            if (fig == null) {
                continue;
            }
            fig.translate(x, y);
        }

    }


    public boolean contient(Point p){

        for (Rectangle fig : figures) {
            if (fig == null) {
                continue;
            }
            if (fig.contient(p)) {
                return true;
            }
        }
        return false;

    }


    public Rectangle retournePlusGrand(){
        Rectangle plusGrand = null;
        for (Rectangle fig : figures){
            if (fig == null) {
                continue;
            }
            if(plusGrand == null || plusGrand .retourneSurface() < fig.retourneSurface()){
                plusGrand = fig;
            }
        }
        return plusGrand;
    }


}
