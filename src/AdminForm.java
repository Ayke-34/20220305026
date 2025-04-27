import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class AdminForm {
    public AdminForm() {
        JFrame frame = new JFrame("Personnel Information");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Ana panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        // ======= Başlık =======
        JLabel titleLabel = new JLabel("Personnel Information");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Çerçeve + İç boşluklar
        Border line = BorderFactory.createLineBorder(Color.BLACK);
        Border empty = new EmptyBorder(8, 16, 8, 16);
        Border compound = new CompoundBorder(line, empty);
        titleLabel.setBorder(compound);

        // Başlığı ekle
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 0, 10, 0);
        panel.add(titleLabel, c);

        // ======= Name Label =======
        JLabel nameLabel = new JLabel("Name:");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(nameLabel, c);

        // Name Input
        JTextField nameField = new JTextField(15);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(nameField, c);

        // ======= Password Label =======
        JLabel passwordLabel = new JLabel("Password:");
        c.gridx = 0;
        c.gridy = 3;
        panel.add(passwordLabel, c);

        // Password Input
        JPasswordField passwordField = new JPasswordField(15);
        c.gridx = 0;
        c.gridy = 4;
        panel.add(passwordField, c);

        // ======= Butonlar =======
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton loginButton = new JButton();
        loginButton.setBackground(Color.GREEN);
        loginButton.setForeground(Color.WHITE);

        JButton forgotButton = new JButton("Forgot Password");
        forgotButton.setBackground(Color.LIGHT_GRAY);
        forgotButton.setForeground(Color.BLACK);

        buttonPanel.add(loginButton);
        buttonPanel.add(forgotButton);

        c.gridx = 0;
        c.gridy = 5;
        panel.add(buttonPanel, c);

        // Panel boyutlandırma
        panel.setPreferredSize(new Dimension(350, 250));

        // Frame'i ekle ve göster
        frame.add(panel);
        frame.pack(); // Frame'i içeriğe göre yeniden boyutlandır
        frame.setVisible(true);
    }
}