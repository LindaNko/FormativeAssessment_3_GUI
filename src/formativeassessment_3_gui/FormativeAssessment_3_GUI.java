/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formativeassessment_3_gui;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author 4010555 FA3
 */
public class FormativeAssessment_3_GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Connection connection = null;
        try {
            // Establish connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fa3_assessment", "root", "Jozinet@17*");
            System.out.println("Database connection successful.");

            // Launch GUI
            java.awt.EventQueue.invokeLater(() -> new FormativeAssessment3GUI().setVisible(true));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Connection Failed: " + e.getMessage(), "Connection Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (connection != null) {
                try {
                    connection.close();  // Close the connection
                } catch (SQLException e) {
                    System.out.println("Error closing the connection: " + e.getMessage());
                }
            }
        }
    }

    }
    

