import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        // create scanner for getting values
        Scanner scan_Val = new Scanner(System.in);

        // call scanner to gather values
        System.out.print("Enter Your First Name :");
        String Fname = scan_Val.next();

        System.out.print("Enter Your Last Name :");
        String Lname = scan_Val.next();

        // call person information class
        PersonInfo person = new PersonInfo();

        // assign value to method in Person info class
        person.details(Fname, Lname);

        System.out.print("Enter Your Marks :");
        int marks = scan_Val.nextInt();

        // call result calculator class
        ResultsLatter rL = new ResultsLatter();

        System.out.println("Marks : " + rL.marksCheck(marks));
    }
}

/**
 * Person Info
 */
class PersonInfo {

    // create method for student details
    public void details(String Fname , String Lname) {
        String name = Fname + " " + Lname;
        System.out.println("Hello " + Fname + Lname);
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