import javax.swing.JFrame;
import java.awt.Color;
/*

References: https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html
References: https://docs.oracle.com/javase/7/docs/api/java/awt/event/ActionListener.html
References: https://stackoverflow.com/questions/35104151/change-jbuttons-click-color
 */
public class MainCalculator {

    public static void main(String[] args) {

        //Create new frame and set title
        JFrame frame = new InterestRateCalculator();
        frame.setTitle("5% Interest Rate Calulator");
        frame.setSize(500, 400);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
