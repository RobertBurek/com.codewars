package testTriangle;

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

    static String noSpace(final String x) {
        return x.replace(" ","");
    }

    public static void main (String[] args){
        if (isTriangle(7, 2, 2)) {
            System.out.println("To jest trójkąt.");
        } else System.out.println("Nie jast to trójkąt!!!");

        System.out.println(noSpace("erer e re r rerer trt yt y tuy ty"));


    }

}
