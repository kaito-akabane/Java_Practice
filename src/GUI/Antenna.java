package GUI;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Antenna extends JFrame {
    // 패널
    JPanel pd = new JPanel();
    
    // 레이블
    Label dirL = new Label("Direction [*]:", Label.RIGHT);
    Label heiL = new Label("Height [m]:", Label.RIGHT);
    
    // 필드
    JTextField dirF = new JTextField(20);
    JTextField heiF = new JTextField(20);
    
    // 체크박스
    JCheckBox lowerEdge = new JCheckBox("Height is Lower Edge (Not center)");
    
    // 레이아웃
    GridBagLayout gbl = new GridBagLayout();
    
    Antenna() {
        pd.setLayout(gbl);
        pd.setBorder(new TitledBorder("Position/Direction"));
        
        gb(dirL, 0, 0, 1, 1);
        gb(dirL, 0, 0, 1, 1);
        gb(heiL, 0, 1, 1, 1);
        gb(heiF, 1, 1, 1, 1);
        gb(lowerEdge, 1, 2, 1, 1);
        
        pd.add(dirL);
        pd.add(dirF);
        pd.add(heiL);
        pd.add(heiF);
        pd.add(lowerEdge);
        
        add(pd);
        
        pack();
        setTitle("Antenna");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void gb(Component c, int x, int y, int w, int h) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gbl.setConstraints(c, gbc);
        this.add(c);
    }
    
    public static void main(String[] args) {
        new Antenna();
    }
}