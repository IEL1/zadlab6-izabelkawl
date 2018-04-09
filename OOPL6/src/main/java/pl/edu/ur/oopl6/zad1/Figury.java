package pl.edu.ur.oopl6.zad1;

public class Figury {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r) {
        return 2 * Math.PI * r;
    }

    //Kwadrat
    public static double Polekwadrat(double a) {
        return Math.pow(a, 2);
    }

    public static double Obwodkwadrat(double a) {
        return Math.pow(a, 2);
    }
    //Prostokąt

    public static double Poleprostokat(double a, double b) {
        return a * b;

    }

    public static double Obwodprostokat(double a, double b) {
        return 2 * a + 2 * b;
    }

    //Stożek
    public static double Polestozek(double r, double h){
        return  h * Math.PI * Math.pow(r, 2)*1/3;
    }

    //walec
    public static double Polewalec(double r, double h) {
        return h * Math.PI * Math.pow(r, 2);
    }
}
