public class defaultdata {
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;
    
    public static void main(String[] args) {
        System.out.println("DATA            DEFAULT              BYTES");
        System.out.println("----------------------------------------------");
        System.out.println("byte          " + byteVar + "                " + Byte.BYTES);
        System.out.println("short         " + shortVar + "                " + Short.BYTES);
        System.out.println("int           " + intVar + "                " + Integer.BYTES);
        System.out.println("long          " + longVar + "                " + Long.BYTES);
        System.out.println("float         " + floatVar + "              " + Float.BYTES);
        System.out.println("double        " + doubleVar + "              " + Double.BYTES);
        System.out.println("char          '" + charVar + "'               " + Character.BYTES);
      }}
