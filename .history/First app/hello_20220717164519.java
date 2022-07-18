import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        // create scanner for getting values
        Scanner s1 = new Scanner(System.in);

        // call scanner to gather values
        System.out.print("Enter Your Name :");
        String name = s1.next();

        System.out.print("Enter Your Address :");
        String addr = s1.next();

        System.out.print("Enter Your Living City :");
        String city = s1.next();

        // call person information class
        PersonInfo person = new PersonInfo();

        // assign value to method in Person info class
        person.name(name, addr , city);
    }
}

/**
 * Person Info
 */
class PersonInfo {

    // create method for name
    public void name(String name , String address , String city) {
        System.out.println("Hello " + name + " are you living in " + address +" is it near to " + city);
    }
}

/**
 * ResultsLatter
 */
class ResultsLatter {

    public int marksCheck(int marks) {
        String latter;
        if (marks <= 100 && marks >= 0 ){
            if (marks >= 75){
                return latter = "";
            }
        }
        return marks;
    }
}