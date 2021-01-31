/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klaidos;

import java.io.IOException;

/**
 *
 * @author 37067
 */
public class Klaidos {
    
    public static void klaiduGeneratorius() throws IOException, MyException {
        double sk = Math.random();
        System.out.println(sk);
        if (sk < 0.3) {
            throw new IllegalArgumentException("IAE!!!"); 
        } else if (sk < 0.6) {
            throw new IndexOutOfBoundsException("IOOBE");
        } else if (sk < 0.9) {
            throw new MyException("Tikrai mano");
        }
        System.out.println("Nebuvo klaidos");
    }
    public static void tustiVartai() throws IOException, MyException  {
        System.out.println("Pries tuscius vartus");
        klaiduGeneratorius();
        System.out.println("Uz tusciu vartu");
    }
    public static void klaidaKlaidoj() {
        System.out.println("Gaudom visas klaidas");
        try {
            tustiVartai();
        }
        catch (Exception ex) {
            throw new UnsupportedOperationException("Klaida kalidoj", ex);   
        }
        System.out.println("Nebuvo klaidos");
    }
   
    
    
//    public static long fakt(long sk) {
//        if (sk < 0) {
//            throw new IllegalArgumentException("Negalima paskaiciuoti neigiamo skaiciaus faktorialo");
//        }
//        if (sk == 0) {
//            return 1;
//        }
//        return sk * fakt(sk - 1);
//    }
//     
//    public static double dalyba(double dalinys, double daliklis) {
//        if (daliklis == 0) {
////            IllegalArgumentException iae = new IllegalArgumentException();
////            iae.addSuppressed(new Throwable());
////            throw iae;
//             throw new IllegalArgumentException("Dalyba is nulio negalima");
//        }
//        return dalinys / daliklis;
//    }
//    public static long faktSuma(long nuo, long iki) {
//        long suma = 0;
//        for (long i = nuo; i <= iki; i++) {
//            try {
//                suma += fakt(i);
//            } catch (IllegalArgumentException ex) {
//                ex.printStackTrace();
//                System.out.println("Nesigavo paskaiciuoti faktorialo skaicui: " + i);
//            }
//        }
//        return suma;
//    }
    
    public static void main(String[] args) {
        System.out.println("Pradzia");
        try {
            klaidaKlaidoj();
            System.out.println("Be klaidu");
        }
        catch (IllegalArgumentException iae) {
            System.out.println("Pagavom IAE: " + iae);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Pagavom IOOBE: " + ex);
        }
        catch (RuntimeException ex) {
            System.out.println("Pagavom RTE: " + ex);
            ex.printStackTrace();
        }
//        catch (IOException ex) {
//            System.out.println("Pagavom IOE: " + ex);
//        }
        finally {
            System.out.println("VISTIEK SUVEIKS!");
        }
        System.out.println("Pabaiga");
        
        
        
//        System.out.println(faktSuma(1, 5));
//        System.out.println(faktSuma(-2, 5));
//        System.out.println(fakt(5));
//        long sk = (long) (Math.random() * 10 - 5);
//        try {
//            System.out.println("sk: " + sk);
//            System.out.println(fakt(sk));
//            System.out.println("Viskas OK");
//            
//        }
//        catch (IllegalArgumentException iae) {
//            System.out.println("Ivyko klaida" + iae);
//            
//        }
//        System.out.println(fakt(0));
//        System.out.println(dalyba(4, 0));
//        System.out.println(dalyba(4, -4));
    }
    
}
