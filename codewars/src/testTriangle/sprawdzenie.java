package testTriangle;

import java.util.Formatter;

/**
 * Created by Robert Burek
 */
public class sprawdzenie {

    public static boolean isTriangle(int a, int b, int c) {
        boolean triangle = false;
        if ((a > 0) && (b > 0) && (c > 0)) {
            if (a < Integer.MAX_VALUE)
                if (b < Integer.MAX_VALUE)
                    if (c < Integer.MAX_VALUE) {
                        if (a + b > c) triangle = true;
                        if (a + c > b) triangle = true;
                        if (c + b > a) triangle = true;
                    }
        }
        return triangle;
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int licznik = 0;
        boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, true, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]) ++licznik;
            if (arrayOfSheeps[i] != null) {

            }
        }

        return licznik;
    }
    static double suma = 1.00;

    public static String seriesSum(int n) {
        // Happy Coding ^_^
        float suma = 1.00f;
        int j=1;
        if (n > 0) {
            for (int i = 1; i < n ; i++) {
                suma += 1.00f/(j+=3);
            }
        } else suma = 0.00f;
        return String.valueOf(suma);
    }

    public static String even_or_odd(int number) {
        //Place code here
        return (number % 2 == 0)? "Even":"Odd";
    }


    public static void main (String[] args){

            double a= 5.567877;

        System.out.println(seriesSum(40));
        System.out.println(seriesSum(0));



    }

}
