//**************************************************************************************************
// CLASS: View
//
// DESCRIPTION
// The View class for Project 2.
//
// COURSE AND PROJECT INFORMATION
// CSE205 Object Oriented Programming and Data Structures, A-2022
// Project Number: P3
//
//  * AUTHOR: Zehr, Nicholas
// Asuriteid:1219718305
// Email: nicholas.zehr@icloud.com
//**************************************************************************************************
package proj3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The View class implements the GUI. It is a subclass of JFrame and implements
 * the ActionListener
 * interface so that we can respond to user-initiated GUI events.
 */
public class View extends JFrame implements ActionListener {

    /**
     * The width of the View frame. Define a private class constant.
     */
    ???

    /**
     * The height of the View frame. Define a private class constant.
     */
    ???

    /**
     * When the View() ctor is called from View.run() to create the View, run()
     * passes a reference
     * to the View object as the argument to View(). We save that reference into
     * mView and then
     * later we can use mView to communicate with the View class.
     *
     * mView is made accessible within this class via accessor/mutator methods
     * getView() and
     * setView(). It shall not be directly accessed.
     */
    ???

    /*
     * Declare GUI related instance variables for the buttons and text fields.
     */
    ???

    /**
     * View()
     *
     * The View constructor creates the GUI interface and makes the frame visible at the end.
     *
     * @param pView is an instance of the View class. This links the View to the View class so
     * they may communicate with each other.
     */
    public View(View pView) {

        /**
         * Save a reference to the View object pView into instance var mView by calling setView().
         */
        setView(pView);

        // PSEUDOCODE:
        // Create a JPanel named panelSearch which uses the FlowLayout
        // Add a JLabel "Student Name: " to panelSearch
        // Create mStudentName and make the field 25 cols wide
        // Add mStudentName to the panel
        // Create mSearchButton with the label "Search"
        // Make this View the action listener for the button
        // Add the button to the panel
        ???

        // PSEUDOCODE:
        // Create a JPanel named panelHomework which uses the FlowLayout
        // Add a JLabel "Homework: " to the panel
        // Create mHomeworkText which is an array of JTextFields, one for each homework assignment
        // For i = 0 to the number of homework assignments Do
        //     Create a textfield mHomeworkText[i] displaying 5 cols
        //     Add mHomeworkText[i] to the panel
        // End For
        // Note: DO NOT HARDCODE THE NUMBER OF HOMEWORK ASSIGNMENTS
        ???

        // Create the exam panel which contains the "Exam: " label and the two exam text fields.
        // The pseudocode is omitted because this code is very similar to the code that creates the
        // panelHomework panel above.
        // Note: DO NOT HARDCODE THE NUMBER OF EXAMS
        ???

        // PSEUDOCODE:
        // Create a JPanel named panelButtons using FlowLayout
        // Create the Clear button mClearButton labeled "Clear"
        // Make this View the action listener for mClearButton
        // Add the  Clear button to the panel
        // Repeat the three above statements for the Save button
        // Repeat the three above statements for the Exit button
        ???

        // PSEUDOCODE:
        // Create a JPanel named panelView using a vertical BoxLayout
        // Add panelSearch to panelView.
        // Add panelHomework to panelView
        // Add panelExam to panelView
        // Add panelButtons to panelView
        ???

        // Set the title of the View to whatever you want by calling setTitle()
        ???

        // Set the size of the View to FRAME_WIDTH x FRAME_HEIGHT
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Make the View non-resizable
        setResizable(false);

        // Set the default close operation to JFrame.DO_NOTHING_ON_CLOSE. This disables the X close
        // button in the title bar of the View so now the only way to exit the program is by click-
        // ing the Exit button. This ensures that View.exit() will be called so it will write the
        // student records back out to the gradebook database.
        ???

        // Add panelView to the View.
        add(panelView);

        // If you are a Mac user, you may need to call the pack() method which is inherited from
        // java.awt.Window() now to pack the View before displaying it. Windows and Linux users do
        // not need to do this, although if you do, it will not cause any problems.
        // ???

        // Now display the View by calling setVisible().
        setVisible(true);
    }

    /**
     * actionPerformed()
     *
     * Called when one of the JButtons is clicked. Detects which button was clicked
     * and handles it.
     *
     * Make sure to write the @Override annotation to prevent accidental overloading
     * because we are
     * overriding JFrame.actionPerformed().
     *
     * PSEUDOCOODE:
     * method actionPerformed(pEvent : ActionEvent) : void
     * If the source of the event was the Search button Then
     * Clear the numbers in the homework and exam fields
     * lastName = retrieve the text from the mStudentName text field
     * If lastName is the empty string Then
     * Call messageBox() to display "Please enter the student's last name."
     * Else
     * -- View contains a method named search() which given the last name of a
     * student
     * -- will search the Roster for the student. search() either returns the
     * Student
     * -- object if found, or if there is no student with that last name in the
     * Roster,
     * -- then search() returns null.
     * Call getView().search(lastName) and pass the return value to
     * Student.setCurrStudent()
     * If the curr student object saved in the Student class is null Then
     * Call messageBox() to display "Student not found. Try again."
     * Else
     * Retrieve the curr student from the Student class and pass it to
     * displayStudent()
     * End if
     * End If
     *
     * Else if the source of the event was the Save button Then
     * If Student.getCurrStudent() is not null Then Call
     * saveStudent(Student.getCurrStudent())
     *
     * Else if the source of the event was the Clear button Then
     * Call clear()
     *
     * Else if the source of the event was the Exit button Then
     * If Student.getCurrStudent() is not null Then Call
     * saveStudent(Student.getCurrStudent())
     * Call getView().exit() to terminate the application
     * End If
     * end actionPerformed
     */
    ???

    /**
     * clear()
     *
     * Called when the Clear button is clicked. Clears all of the text fields by
     * setting the
     * contents of each to the empty string.
     *
     * After clear() returns, no student information is being edited or displayed
     * and mStudent
     * has been set to null.
     *
     * PSEUDOCODE:
     * method clear() : void
     * Set the mStudentName text field to ""
     * Clear the numbers in the homework and exam fields by calling clearNumbers()
     * Set the current Student object in the Student class to null
     * end clear
     */
    ???

    /**
     * clearNumbers()
     *
     * Clears the homework and exam fields.
     *
     * DO NOT HARCODE THE NUMBER OF HOMEWORKS AND EXAMS
     */
    ???

    /**
     * displayStudent()
     *
     * Displays the homework and exam scores for a student in the mHomeworkText and
     * mExamText text
     * fields.
     *
     * @param pStudent is the Student who's scores we are going to use to populate
     *                 the text fields.
     *
     *                 PSEUDOCODE:
     *                 method displayStudent(pStudent : Student) : void
     *                 For i = 0 to View.getNumHomeworks - 1 Do
     *                 int hw = pStudent.getHomework(i)
     *                 String hwstr = convert hw to a String (Hint:
     *                 Integer.toString())
     *                 mHomeworkText[i].setText(hwstr)
     *                 End For
     *                 Write a similar for loop to place the student's exams scores
     *                 into the text fields
     *                 end displayStudent
     *
     *                 DO NOT HARCODE THE NUMBER OF HOMEWORKS AND EXAMS
     */
    ???

    /**
     * Accessor method for mView.
     */
    private View getView() {
        return mView;
    }

    /**
     * messageBox()
     *
     * Displays a message box containing some text. Note: read the Java 8 API page
     * for JOptionPane
     * to see what the constructor arguments are to showMessageDialog(). You want to
     * pass the
     * appropriate "thing" for the first argument so your message dialog window will
     * be centered
     * in the middle of the View frame. If your View frame is centered in the middle
     * of your screen
     * then you did not pass the right "thing".
     *
     * PSEUDOCODE:
     * method messageBox(pMessage : String) : void
     * Call JOptionPane.showMessageDialog() to display pMessage.
     * end messageBox
     */
    ???

    /**
     * saveStudent()
     *
     * Retrieves the homework and exam scores for pStudent from the text fields and
     * writes the
     * results to the Student record in the Roster.
     *
     * PSEUDOCODE:
     * method saveStudent(pStudent : Student) : void
     * For i = 0 to View.getNumHomeworks - 1 Do
     * String hwstr = mHomeworkText[i].getText()
     * int hw = convert hwstr to an int (Hint: Integer.parseInt())
     * Call pStudent.setHomework(i, hw)
     * End For
     * Write a similar for loop to save the exam scores in pStudent
     * end method saveStudent
     *
     * DO NOT HARDCODE THE NUMBER OF HOMEWORKS AND EXAMS
     */
    ???

    /**
     * Mutator method for mView.
     */
    private void setView(View pView) {
        mView = pView;
    }

}
