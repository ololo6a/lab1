/**
 * Created by Администратор on 16.07.2016.
 */
public class Lab1 {


    public static void main(String[] args) {

        byte b = 100;
        short s = 32000;
        int i = 64000;
        long l = 100_000_000_000L;
        double d = 0.0d;
        float f = 0.0f;
        char c = 'c';
        char c1= '1';


        // byte to short
         s = (short) b ;

        // short to int
         i = (int) s;

        // int to long
        l = (long) i;

        //long to double
        d = (double) l;
        // SAME
        d = new Long(l).doubleValue();

        // int to float
        f = (float) i;

        // float to double
        d = (double) f;
        d = f;

        //char to int

        i= (int) c;
        System.out.println(i); // = 99

        i= (int) c1;
        System.out.println(i); // = 49

        i= Character.getNumericValue(c1); //  = 1
        System.out.println(i);


        //int to double
        d = (double) i;

        // long to float

        l = 100000000L;


        f = (float) l;
        System.out.println(f);
        // SAME
        f = new Long(l).floatValue();
        System.out.println(f);
    }
}
