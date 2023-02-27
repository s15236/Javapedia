import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");

        int histFigures = scan.nextInt();
        //classic scan trap
        scan.nextLine();

        /*
         * Ask user to enter data into database of Javapedia
         */
        String[][] database = new String[histFigures][3];

        for (int i = 0; i < database.length; i++) {
            System.out.print("\tFigure: " + (i + 1) + "\n");

            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();

            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();

            System.out.println();
        }

        System.out.println("These are the values you stored:");
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        

        scan.close();
    }

    /**
     * Function name: print2DArray
     *
     * @param array (String[][])
     *              <p>
     *              Inside the function
     *              1. print the database
     *              • a tab of space precedes each row.
     *              • each value in database has one space from the other value.
     *              • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
