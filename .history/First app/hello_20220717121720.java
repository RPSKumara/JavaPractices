import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        System.out.print("Enter name :");

        // create scanner for getting values
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();

        // call person information class
        PersonInfo person = new PersonInfo();

        // assign value to method in 
        person.name(name);
    }
}

/**
 * PersonInfo
 */
class PersonInfo {
    public void name(String name) {
        System.out.println("Hello " + name);
    }
}