/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klaidos;

/**
 *
 * @author 37067
 */
public class Klaidos {
   
    public static long fakt(long sk) {
        if (sk < 0) {
            throw new IllegalArgumentException("Negalima paskaiciuoti neigiamo skaiciaus faktorialo");
        }
        if (sk == 0) {
            return 1;
        }
        return sk * fakt(sk - 1);
    }
     
    public static double dalyba(double dalinys, double daliklis) {
        if (daliklis == 0) {
//            IllegalArgumentException iae = new IllegalArgumentException();
//            iae.addSuppressed(new Throwable());
//            throw iae;
             throw new IllegalArgumentException("Dalyba is nulio negalima");
        }
        return dalinys / daliklis;
    }
    public static void main(String[] args) {
        System.out.println(fakt(5));
        long sk = (long) (Math.random() * 10 - 5);
        try {
            System.out.println("sk: " + sk);
            System.out.println(fakt(sk));
            System.out.println("Viskas OK");
            
        }
        catch (IllegalArgumentException iae) {
            System.out.println("Ivyko klaida" + iae);
            
        }
        System.out.println(fakt(0));
//        System.out.println(dalyba(4, 0));
//        System.out.println(dalyba(4, -4));
    }
    
}
