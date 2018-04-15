/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad1;

/**
 *
 * @author Izabela
 */
public class Complex {

    public double re; // rzeczywista
    public double im; // urojona

    // konstruktor
    public Complex(double r, double i) {
        re = r;
        im = i;
    }

    // moduł
    public static double Modul(Complex n) {
        return Math.sqrt(Math.pow(n.re, 2) + Math.pow(n.im, 2));
    }

    // sprzężenie
    public static Complex Sprzezenie(Complex n) {
        return new Complex(n.re, (-1) * (n.im));
    }

    // suma
    public static Complex Suma(Complex n1, Complex n2) {
        return new Complex(n1.re + n2.re, n1.im + n2.im);
    }

    // różnica
    public static Complex Roznica(Complex n1, Complex n2) {
        return new Complex(n1.re - n2.re, n1.im - n2.im);
    }

    // iloraz
    public static Complex Iloraz(Complex n1, Complex n2) {
        return new Complex((n1.re * n2.re + n1.im * n2.im) / (n2.re * n2.re + n2.im * n2.im), (n1.im * n2.re - n1.re * n2.im) / (n2.re * n2.re + n2.im * n2.im));
    }
    
    // iloczyn
    public static Complex Iloczyn(Complex n1, Complex n2) {
        return new Complex((n1.re * n2.re) - (n1.im * n2.im), (n1.re * n2.im) + (n1.im * n2.re));
    }

    @Override
    public String toString() {
        return "" + re + im;
    }

    public static void main(String[] args) {
        // losowe liczby podane przez programistę
        Complex m1 = new Complex(5, 2);
        Complex m2 = new Complex(15, -3);
        Complex n1 = new Complex(7, 2);
        Complex n2 = new Complex(4, 3);

        System.out.println("Moduł: " + Modul(m1));
        System.out.println("Sprzężenie: " + Sprzezenie(m2));
        System.out.println("Suma: " + Suma(n1, n2));
        System.out.println("Rożnica: " + Roznica(n1, n2));
        System.out.println("Iloczyn: " + Iloczyn(n1, n2));
        System.out.println("Iloraz: " + Iloraz(n1, n2));
    }
}
