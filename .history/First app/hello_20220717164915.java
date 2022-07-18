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

        System.out.print("Enter Your Living City :");
        int marks = s1.nextInt();

        // call person information class
        PersonInfo person = new PersonInfo();

        // assign value to method in Person info class
        person.name(name, addr , city);

        // call result caluc
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

    public String marksCheck(int marks) {
        String latter = "marks not in range";
        if (marks <= 100 && marks >= 0 ){
            if (marks >= 75){
                latter = "A";
                return latter;
            }
            else if (marks >= 65) {
                latter = "B";
                return latter;
            }
            else if (marks >= 55) {
                latter = "C";
                return latter;
            }
            else if (marks >= 35) {
                latter = "S";
                return latter;
            }
            else {
                latter = "W";
                return latter;
            }
        }
        return latter;
    }
}