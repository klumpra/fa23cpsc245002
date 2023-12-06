import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.util.ArrayList;
public class SummaryPanel extends JPanel {
    private ArrayList<Circle> circles;
    private JTextArea tarSummary;
    public void setupGUI() {
        setLayout(new BorderLayout());
        JPanel panNorth = new JPanel();
        panNorth.setLayout(new FlowLayout());
        JLabel lblSummary = new JLabel("Circle Summary");
        panNorth.add(lblSummary);
        add(panNorth,BorderLayout.NORTH);
        tarSummary = new JTextArea(10,30);
        tarSummary.setEditable(false);
        add(tarSummary,BorderLayout.CENTER);
    }
    public SummaryPanel(ArrayList<Circle> circles) {
        this.circles = circles;
        setupGUI();
    }
    public void updateList() {
        tarSummary.setText("");
        String text = "";
        for (Circle c : circles) {
            text = text + c + "\n";
        }
        tarSummary.setText(text);
    }
}
