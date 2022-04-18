
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class InterestRateCalculator extends JFrame {
    
    //declaring lables that will display amounts
    private JLabel loanAmount;
    private JLabel months;
    private JLabel monthlyPayment;
    private JLabel totalPayment;
    private JTextField textField; //text field for user input
    private JSlider slider; //slider for monthly payment
    private JButton calculateButton;
    private JButton clearButton;

    //everything can be done in the constructor itself by setting up fields and giving instruction on clicked fields
    public InterestRateCalculator() {
        //setting up the frame and labels
        loanAmount = new JLabel("Enter Loan Amount: ");
        loanAmount.setBounds(50, 10, 250, 30);
        add(loanAmount);

        textField = new JTextField(12);
        textField.setBounds(180,10,250,30);
        add(textField);

        months = new JLabel("Select Loan Term (Months): ");
        months.setBounds(50, 40, 250, 30);
        add(months);

        //setting up slider location and parameters
        slider = new JSlider(JSlider.HORIZONTAL, 0, 60, 10);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels(6));
        slider.setBounds(50, 70, 250, 50);
        add(slider);
        
        //setting up the label for monthly payment
        monthlyPayment = new JLabel("Monthly payment: ");
        monthlyPayment.setBounds(50, 120, 250, 30);
        add(monthlyPayment);

        //setting up the label for total amount calculated
        totalPayment = new JLabel("Total payment: ");
        totalPayment.setBounds(50, 140, 250, 30);
        add(totalPayment);

        //setting up buttons
        calculateButton = new JButton("Calculate Total");
        calculateButton.setBounds(50, 180, 150, 30);
        clearButton = new JButton("Reset");
        clearButton.setBounds(200, 180, 100, 30);
        add(calculateButton);
        add(clearButton);

        //adding action listener to the calculate button so that the calculated prices can be displayed
        calculateButton.addActionListener(new ActionListener() {

        
        @Override
        public void actionPerformed(ActionEvent e) {

            String loanAmount = String.valueOf(textField.getText());

            if (loanAmount.equals("")) {

                JOptionPane.showMessageDialog(null, "Please valid amount");

            } else {
                double rate = 5.00;
                double loan = Double.parseDouble(loanAmount);
                int term = slider.getValue();
                double total = loan * (rate / 100) * term;
                double monthly = total / term;
                monthlyPayment.setText("Montlhy payment: $" + String.format("%.2f", monthly));
                totalPayment.setText("Total payment: $" + String.format("%.2f", total));


            }
            }});
            //clearing field values once the clear button is clicked
            clearButton.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                textField.setText("");

                monthlyPayment.setText("Montlhy payment: $");

                totalPayment.setText("Total payment: $");

                slider.setValue(10);

            }

            });

        //change button text color on click
        calculateButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                calculateButton.setForeground(Color.red); // button text color
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                calculateButton.setForeground(Color.black); // button text color
            }
            });
        clearButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                clearButton.setForeground(Color.red); // button text color
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                clearButton.setForeground(Color.black); // button text color
            }
            });

    }
}


