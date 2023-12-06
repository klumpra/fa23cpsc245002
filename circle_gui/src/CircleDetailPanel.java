import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
/*
 * the panel that occupies the west side of our frame
 */
public class CircleDetailPanel extends JPanel {
    private JTextField txtX;
    private JTextField txtY;
    private JTextField txtRadius;
    private JTextArea tarComment;
    public void setupGUI() {
        setLayout(new BorderLayout());
        JPanel panNorth = new JPanel();
        panNorth.setLayout(new GridLayout(3,2));
        JLabel labX = new JLabel("X coord");
        txtX = new JTextField(5);
        JLabel labY = new JLabel("Y coord");
        txtY = new JTextField(5);
        JLabel labRad = new JLabel("Radius");
        txtRadius = new JTextField(5);
        panNorth.add(labX);
        panNorth.add(txtX);
        panNorth.add(labY);
        panNorth.add(txtY);
        panNorth.add(labRad);
        panNorth.add(txtRadius);
        add(panNorth,BorderLayout.NORTH);
        JPanel panComment = new JPanel();
        panComment.setLayout(new BorderLayout());
        JLabel labComment = new JLabel("Add Comment");
        panComment.add(labComment,BorderLayout.NORTH);
        tarComment = new JTextArea(5,10);
        panComment.add(tarComment,BorderLayout.CENTER);
        add(panComment,BorderLayout.CENTER);
    }
    public CircleDetailPanel() {
        setupGUI();
    }
    public double getXVal() {
        return Double.parseDouble(txtX.getText());
    }
    public double getYVal() {
        return Double.parseDouble(txtY.getText());
    }
    public double getRadius() {
        return Double.parseDouble(txtRadius.getText());
    }
    public String getComment() {
        return tarComment.getText();
    }
    public void clearEntries() {
        txtX.setText("");
        txtY.setText("");
        txtRadius.setText("");
        tarComment.setText("");
    }
    public void enableEntries(boolean enableYN) {
        txtX.setEnabled(enableYN);
        txtY.setEnabled(enableYN);
        txtRadius.setEnabled(enableYN);
        tarComment.setEnabled(enableYN);
    }
}
