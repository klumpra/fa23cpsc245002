import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class MainFrame extends JFrame {
    private ArrayList<Circle> circles;
    private CircleDetailPanel cdp;
    private JButton btnAddCircle;
    public void setupGUI() {
        setBounds(100,100,500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Circles");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        cdp = new CircleDetailPanel();
        SummaryPanel sumPan = new SummaryPanel(circles);
        c.add(cdp,BorderLayout.WEST);
        c.add(sumPan,BorderLayout.EAST);
        JPanel panSouth = new JPanel();
        btnAddCircle = new JButton("Add Circle");
        btnAddCircle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double x=0, y=0, radius=0;
                ArrayList<String> errors = new ArrayList<String>();
                try {
                    x = cdp.getXVal();
                } catch (Exception ex) {
                    errors.add("The x coordinate must be a number.");
                }
                try {
                    y = cdp.getYVal();
                } catch (Exception ex) {
                    errors.add("The y coordinate must be a number.");
                }
                try {
                    radius = cdp.getRadius();
                } catch (Exception ex) {
                    errors.add("The radius must be a number.");
                }
                String comment = cdp.getComment();
                String errorMessage = "";
                if (errors.size() > 0) {
                    for (String error : errors) {
                        errorMessage = errorMessage + error + " ";
                    }
                    JOptionPane.showMessageDialog(null,"These errors occured: " + errorMessage);
                } else {
                    Circle c = new Circle(x,y,radius,comment);
                    circles.add(c);
                    sumPan.updateList();
                    cdp.clearEntries();
                    repaint();  // updates what is shown on the frame
                }
            }
        });
        panSouth.setLayout(new FlowLayout());
        panSouth.add(btnAddCircle);
        c.add(panSouth,BorderLayout.SOUTH);
        setupMenu();
//        enableControls(false);
    }
    public void setupMenu() {
        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);
        JMenu mnuFile = new JMenu("File");
        mbar.add(mnuFile);
        JMenu mnuHelp = new JMenu("Help");
        mbar.add(mnuHelp);
        JMenuItem miLogin = new JMenuItem("Log in");
        JMenuItem miLogout = new JMenuItem("Log out");
        JMenuItem miSave = new JMenuItem("Save");
        JMenuItem miExit = new JMenuItem("Exit");
        mnuFile.add(miLogin);
        mnuFile.add(miLogout);
        mnuFile.add(miSave);
        mnuFile.add(miExit);
        miExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JMenuItem miAbout = new JMenuItem("About");
        mnuHelp.add(miAbout);
        miAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Circle App GUI, December 2023");
            }
        });
        miSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                File f;
                if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    f = chooser.getSelectedFile();
                    if (CircleWriter.writeToFile(f,circles)) {
                        JOptionPane.showMessageDialog(null,"Circles were saved.");
                    } else {
                        JOptionPane.showMessageDialog(null,"Circles were not saved.");
                    }
                }
            }
        });
    }
    public MainFrame(ArrayList<Circle> circles) {
        this.circles = circles;
        setupGUI();
    }
    public void enableControls(boolean enableYN) {
        cdp.enableEntries(enableYN);
        btnAddCircle.setEnabled(enableYN);
    }
}
