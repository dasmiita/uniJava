public class ascii
{
    public static void main(String [] args){
System.out.println("ASCII values of numbers:");
for (int i = 48; i <= 57; i++) { // ASCII values of '0' to '9'
System.out.println((char) i + " = " + i);
}
System.out.println("\nASCII values of uppercase letters:");
for (int i = 65; i <= 90; i++) { // ASCII values of 'A' to 'Z'
System.out.println((char) i + " = " + i);
}
System.out.println("\nASCII values of lowercase letters:");
for (int i = 97; i <= 122; i++) { // ASCII values of 'a' to 'z'
System.out.println((char) i + " = " + i);
}
System.out.println("\nASCII values of special characters:");
for (int i = 33; i <= 47; i++) { // ASCII values of '!' to '/'
System.out.println((char) i + " = " + i);
}}}