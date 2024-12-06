package weekThree.labThree;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Login {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "password";
        String name = JOptionPane.showInputDialog("Enter your username: ");
        String pw = JOptionPane.showInputDialog("Enter your password: ");

        //both username and password are correct
        if (name.equals(userName) && pw.equals(password)) {
            showMessageDialog(null, "Welcome to CS121!");
        }
        //both username and password are incorrect
        else if (!name.equals(userName) && !pw.equals(password)) {
            showMessageDialog(null, "Incorrect username and password!");
        }
        //username is incorrect
        else if (!name.equals(userName)) {
            showMessageDialog(null, "Username is incorrect.");
        }
       //incorrect password
        else {
            showMessageDialog(null, "Password is incorrect.");
        }
    }
}
