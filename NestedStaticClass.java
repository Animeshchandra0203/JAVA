public class NestedStaticClass {
    
    static class Inner{
      public static void main(String[] args) {      // to compile:  javac NestedStaticClass.java
        System.out.println("hello World \nfrom STATIC INNER class");
      }                                            //to RUN in POWERSHELL: java NestedStaticClass`$Inner
    }                                                                   // java "NestedStaticClass$Inner"
    public static void main(String[] args) {      // to compile:  javac NestedStaticClass.java
        System.out.println("hello World \nfrom OUTER class"); //to run in CMD: java NestedStaticClass$Inner
      }       
}                                                  
