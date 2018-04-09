/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad1;
/**
 *
 * @author student
 */
public class Complex {
      private double re; // część rzeczywista
      private double im; // część urojona

      /* konstruktor */
      public Complex(double x) {
        re = x;
        im = 0.0;
      }

      /* drugi konstruktor */
      public Complex(double r, double i) {
        re = r;
        im = i;
      }

      /* moduł */
      public static double modul(double x,double i){
        return Match.sqrt((x)^2*(i)^2);
      }
}