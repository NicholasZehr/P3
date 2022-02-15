//**************************************************************************************************
// CLASS: Main
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// (c) Kevin R. Burger 2014-2022
//**************************************************************************************************
package proj3;

import java.io.FileNotFoundException;
import javax.swing.JFrame;

/**
 * The Main class containing the main() and run() methods.
 */
public class Main {

    /**
     * The Roster of students that is read from the input file "gradebook.dat".
     */
    ???

    /**
     * A reference to the View object.
     */
    ???

    /**
     * This is where execution starts. Instantiate a Main object and then call run().
     */
    ???

    /**
     * exit() is called when the Exit button in the View is clicked. When we exit we have to write
     * the roster to the output file "gradebook.dat". Then we exit the program with a code of 0.
     *
     * We open the file and write the roster to it in a try-catch block, where we catch a
     * FileNotFoundException that will be thrown if for some reason, we cannot open "gradebook.dat"
     * for writing.
     *
     * PSEUDOCODE:
     * method exit() : void
     *     try
     *         instantiate a GradebookWriter object named gbWriter, opening "gradebook.dat" for
     *         writing
     *         call writeGradebook(getRoster()) on gbWriter
     *         call System.exit(0) to terminate the application with an exit code of 0
     *     catch FileNotFoundException e
     *         call messageBox() on getView() to display a message box containing the text "Could
     *         not open gradebook.dat for writing. Exiting without saving."
     *         call System.exit(-1) to terminate the application with an error code of -1
     *     end try-catch
     * end exit
     */
    ???

    /**
     * This method returns the number of exams in the class.
     */
    ???

    /**
     * This method returns the number of homework assignments in the class.
     */
    ???

    /**
     * Accessor method for mRoster.
     */
    private Roster getRoster() {
        return mRoster;
    }

    /**
     * Accessor method for mView.
     */
    private View getView() {
        return mView;
    }

    /**
     * run() is the main routine and is called from main().
     *
     * PSEUDOCODE:
     * method run
     *     call JFrame.setDefaultLookAndFeelDecorated(true or false depending on your preference)
     *     -- Create the View passing 'this' as the argument so the View will be linked to the Main
     *     -- class so they may communicate with each other. Then pass the newly created View object
     *     -- to setView() to save the reference to the View in our instance variable mView.
     *     call setView(new View(this)) to create the View and stored the returned object in mView
     *     try
     *         -- Note that when we try to open "gradebook.dat" for reading that GradebookReader()
     *         -- may throw a FileNotFoundException which we catch here.
     *         create a GradbookReader object named gbReader opening "gradebook.dat" for reading
     *         -- Read the student roster from the input file.
     *         call readGradebook() on gbReader, which returns the Roster
     *         call setRoster() on the Roster returned from readGradebook() to save the roster in
     *         our instance variable mRoster
     *     catch
     *         call messageBox() on getView() to display the error message "Could not open
     *         gradebook.dat for reading. Exiting."
     *         call System.exit(-1) to terminate the application with an exit code of -1
     *     end try-catch
     * end run
     */
    ???

    /**
     * search() is called when the Search button is clicked in the View. The input parameter is
     * the last name of the Student to search the roster for. Call getStudent(pLastName) on the
     * Roster object (call getRoster() to get the reference to the Roster) to get a reference to
     * the Student with that last name. If the student is not located, getStudent() returns null.
     *
     * @param pLastName The last name of the student who we will search the Roster for.
     *
     * PSEUDOCODE:
     * method search(pLastName : String) : Student
     *     call getRoster().getStudent(pLastName) and return what getStudent() returns
     * end search
     */
    ???

    /**
     * Mutator method for mRoster.
     */
    private void setRoster(Roster pRoster) {
        mRoster = pRoster;
    }

    /**
     * Mutator method for mView.
     */
    private void setView(View pView) {
        mView = pView;
    }
}
