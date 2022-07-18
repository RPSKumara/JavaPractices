import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        System.out.print("Enter name :");
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();
        System.out.println("Hello : " + name);
    }
}

/**
 * PersonInfo
 */
class PersonInfo {
    public void name(String name) {
        System.out.println("Hello ");
    }
}