import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        // create scanner for getting values
        Scanner scan_Val = new Scanner(System.in);

        // call person information class
        PersonInfo person = new PersonInfo();

        // call result calculator class
        ResultsLatter rL = new ResultsLatter();

        System.out.print("How many students in your class :");
        int numS = scan_Val.nextInt();
        int x = 0;

        String[][] marksList = new String[numS][numS];

        for (numS-- ; numS>=0; numS--){
            int y = 0;

            // call scanner to gather values
            System.out.print("Enter Your First Name :");
            String Fname = scan_Val.next();

            System.out.print("Enter Your Last Name :");
            String Lname = scan_Val.next();

            // assign value to method in Person info class
            String name = person.details(Fname, Lname);
            marksList[x][y] = name;
            y++;

            System.out.print("Enter " + name + "'s Mark :");
            int marks = scan_Val.nextInt();

            String score_Latter =  rL.marksCheck(marks);
            marksList[x][y] = score_Latter;
            x++;
            System.out.println("Student count: "+x);
        }

        System.out.println(marksList[0][0]);
        System.out.println(marksList[0][2]);
    }
}

/**
 * Person Info
 */
class PersonInfo {

    // create method for student details
    public String details(String Fname , String Lname) {
        String fullName = Fname + " " + Lname;
        return fullName;
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