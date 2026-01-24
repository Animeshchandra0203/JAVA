public class DefaultValue {
    // default value of boolean --> FALSE
    static boolean b1; // can be used by STATIC variables and methods
    boolean b2; // used by NON static variables and methods

    void bool() // non-static methods can access both non-static and static variables and methods
    {
        System.out.println("default value of (static)boolean: " + b1);
        System.out.println("default value of boolean: " + b2);
        boolean x, y;
        x = b1;
        y = b2;
        System.out.println("static copy: " + x + "non static copy: " + y);
    }

    boolean m = b1; // static variables can access ONLY static variables

    public static void main(String args[]) 
    {
        boolean x = b1;
        System.out.println("default value of (static)boolean: " + b1);
        System.out.println("static copy: " + x + "\n");

        // to access NON-static variables and methods, create an object of class and the call it throught the object
        DefaultValue d1 = new DefaultValue();
        d1.bool();
    }
}
