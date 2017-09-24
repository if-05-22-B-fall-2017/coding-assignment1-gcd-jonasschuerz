/*
 * Jonas Schürz
 * 3 BHIF
 */
package gcd;

import java.util.List;
import java.util.LinkedList;

public class Gcd {

    private static List<Integer> lista;
    /**
     * @param args the command line arguments
     * größter gemeinsamer Teiler 
     */
    public static void main(String[] args) {
       lista = new LinkedList<>();
       System.out.printf("Gcd\n");
       int a = 87;
       int b = 45;
       gcdPrimeFactors(a, b);
        System.out.println("\nGcd Eucledian:\n");
        gcdEucledian(a, b);
    }

    private static void gcdPrimeFactors (int a, int b)
    {
        int number = 2;
        System.out.printf("Number %d\n",a);
        while(a != 1) {
            if ((a % number) == 0) {
                lista.add(number);
                a /= number;
                System.out.printf("%d\n",number);
            }
            else{
                number++;
            }
        }
        number = 2;
        int erg = 1;
        System.out.printf("\nNumber %d\n",b);
        while(b != 1) {
            if ((b % number) == 0) {
                if (lista.contains(number)) {
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) == number) {
                            erg *= number;
                            lista.remove(i);
                            break;
                        }
                    }
                }
                b /= number;
                System.out.printf("%d\n",number);
            }
            else{
                number++;
            }
        }
        System.out.printf("\nErgebnis: %d\n",erg);
    }
    
    private static void gcdEucledian (int a, int b)
    {
        int erg = 0;
        while ( b != 0) {
            erg = a%b;
            a = b;
            b = erg;          
        }
        System.out.printf("Ergebnis: %d\n", a);
    } 
}
