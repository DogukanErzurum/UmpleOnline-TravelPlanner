package com.erzurum.travelexpensetracking.main.app;


import javax.swing.*;

import com.erzurum.travelexpensetracking.main.lib.wrappers.TripManagerWrapper;
import com.erzurum.travelexpensetracking.umple.TripManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @class MainApp
 * @brief The main application window for Travel Expense Tracking.
 * It provides navigation to various functionalities like trip planning, expense recording,
 * budget management, and summary reporting.
 */
public class MainApp extends JFrame {
    private TripManagerWrapper tripManagerWrapper;

    /**
     * @brief Constructor to initialize the main application window.
     * It sets up the UI components and action listeners for buttons.
     */
    public MainApp() {
        tripManagerWrapper = new TripManagerWrapper(new TripManager());

        setTitle("Seyahat Gider Takibi");
        setSize(710, 610);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create UI components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(250, 250, 210));
        
        JButton tripPlanningButton = new JButton("Trip Planning");
        tripPlanningButton.setBackground(new Color(128, 128, 255));
        tripPlanningButton.setForeground(new Color(255, 255, 255));
        tripPlanningButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
        tripPlanningButton.setBounds(81, 122, 531, 80);
        JButton expenseRecordingButton = new JButton("Expense Recording");
        expenseRecordingButton.setBackground(new Color(128, 128, 255));
        expenseRecordingButton.setForeground(new Color(255, 255, 255));
        expenseRecordingButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
        expenseRecordingButton.setBounds(81, 213, 531, 80);
        JButton budgetManagementButton = new JButton("Budget Management");
        budgetManagementButton.setBackground(new Color(128, 128, 255));
        budgetManagementButton.setForeground(new Color(255, 255, 255));
        budgetManagementButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
        budgetManagementButton.setBounds(81, 304, 531, 80);
        JButton summaryReportButton = new JButton("Summary Report");
        summaryReportButton.setBackground(new Color(128, 128, 255));
        summaryReportButton.setForeground(new Color(255, 255, 255));
        summaryReportButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
        summaryReportButton.setBounds(81, 395, 531, 80);
        buttonPanel.setLayout(null);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(81, 496, 531, 15);
        buttonPanel.add(separator_1);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(81, 96, 531, 15);
        buttonPanel.add(separator);

        buttonPanel.add(tripPlanningButton);
        buttonPanel.add(expenseRecordingButton);
        buttonPanel.add(budgetManagementButton);
        buttonPanel.add(summaryReportButton);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        
        JLabel lblTravelExpense = new JLabel("Travel Expense", SwingConstants.CENTER);
        lblTravelExpense.setForeground(Color.WHITE);
        lblTravelExpense.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
        lblTravelExpense.setBounds(10, 22, 674, 52);
        buttonPanel.add(lblTravelExpense);
        
        ImageIcon icon2 = new ImageIcon(RegisterScreen.class.getResource("login.jpg"));
        JLabel label_loginbackground = new JLabel("");
        label_loginbackground.setBounds(0, 0, 688, 569);
        Image image2 = icon2.getImage().getScaledInstance(label_loginbackground.getWidth(),
                label_loginbackground.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iccon = new ImageIcon(image2);
        label_loginbackground.setIcon(iccon);
        buttonPanel.add(label_loginbackground);

        getContentPane().add(mainPanel);

        // Add action listeners for buttons
        tripPlanningButton.addActionListener(new ActionListener() {
            /**
             * @brief Opens the Trip Management screen when the button is clicked.
             * @param e The action event triggered by clicking the button.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                openTripManagementScreen();
            }
        });

        expenseRecordingButton.addActionListener(new ActionListener() {
            /**
             * @brief Opens the Expense Management screen when the button is clicked.
             * @param e The action event triggered by clicking the button.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                openExpenseManagementScreen();
            }
        });

        budgetManagementButton.addActionListener(new ActionListener() {
            /**
             * @brief Opens the Budget Management screen when the button is clicked.
             * @param e The action event triggered by clicking the button.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                openBudgetManagementScreen();
            }
        });

        summaryReportButton.addActionListener(new ActionListener() {
            /**
             * @brief Opens the Summary Report screen when the button is clicked.
             * @param e The action event triggered by clicking the button.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                openReportScreen();
            }
        });
    }

    /**
     * @brief Opens the Trip Management screen and disposes of the current screen.
     */
    private void openTripManagementScreen() {
        // TripManagementScreen with TripManagerWrapper
        new TripManagementScreen(tripManagerWrapper).setVisible(true);
        this.dispose();
    }

    /**
     * @brief Opens the Expense Management screen and disposes of the current screen.
     */
    private void openExpenseManagementScreen() {
        // Code to open ExpenseManagementScreen
        new ExpenseManagementScreen().setVisible(true);
        this.dispose();
    }

    /**
     * @brief Opens the Budget Management screen and disposes of the current screen.
     */
    private void openBudgetManagementScreen() {
        // Code to open BudgetManagementScreen
        new BudgetManagementScreen().setVisible(true);
        this.dispose();
    }

    /**
     * @brief Opens the Summary Report screen and disposes of the current screen.
     */
    private void openReportScreen() {
        // Code to open ReportScreen
        new ReportScreen().setVisible(true);
        this.dispose();
    }
}

