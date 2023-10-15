package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
    JPanel p1 = new JPanel();
    
    JLabel idL = new JLabel("아이디");
    JLabel pwL = new JLabel("비밀번호");
    
    JTextField idF = new JTextField(10);
    JTextField pwF = new JTextField(10);
    
    JButton login = new JButton("로그인");
    JButton signin = new JButton("회원가입");
    
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    
    LoginForm() {
        init();
        deploy();
        showFrame();
    }
    
    void init() {
        p1.setLayout(gbl);
        p1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(2,2,2,2);  //top padding
    }
    
    void deploy() {
        gb(idL, 0, 0, 1, 1);
        gb(idF, 1, 0, 1, 1);
        gb(pwL, 0, 1, 1, 1);
        gb(pwF, 1, 1, 1, 1);;
        gb(login, 2, 0, 1, 2);
        
        p1.add(idL);
        p1.add(idF);
        p1.add(pwL);
        p1.add(pwF);
        p1.add(login);
        
        add(p1, BorderLayout.NORTH);
        add(signin, BorderLayout.CENTER);
    }
    
    void showFrame() {
        setTitle("로그인");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void gb(Component c, int x, int y, int w, int h) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gbl.setConstraints(c, gbc);
    }
    
    public static void main(String[] args) {
        new LoginForm();
    }
}
