import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Ana panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        // ======= Başlık (Login) =======
        JLabel titleLabel = new JLabel("Login");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER); // Yazıyı ortala
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Font büyüklüğü

        // Çerçeve + İç boşluklar
        Border line = BorderFactory.createLineBorder(Color.BLACK);
        Border empty = new EmptyBorder(8, 16, 8, 16); // üst 8px, sağ 16px, alt 8px, sol 16px
        Border compound = new CompoundBorder(line, empty);
        titleLabel.setBorder(compound);

        // Başlığı ekle
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 0, 10, 0); // Başlığın dış boşluğu
        panel.add(titleLabel, c);

        // ======= Name Label =======
        JLabel nameLabel = new JLabel("Name:");
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(0, 0, 0, 0);
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

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.GREEN);
        loginButton.setForeground(Color.WHITE);

        JButton forgotButton = new JButton("Forgot Password");
        forgotButton.setBackground(Color.LIGHT_GRAY);
        forgotButton.setForeground(Color.BLACK);
        // Burada event ekliyoruz:
        loginButton.addActionListener(e -> {
            // Şifreyi kontrol et
            String password = new String(passwordField.getPassword());
            String name = new String(nameField.getText());
            // Eğer şifre doğruysa PersonelForm'u aç
            if (password.equals("12345") && name.equals("aybuke")) {
                new PersonnelForm();  // Başlık "Merhaba"
            } else if (password.equals("6789") && name.equals("aksoy")) {
                new AdminForm();  // Başlık "Dünya"
            } else {
                JOptionPane.showMessageDialog(frame, "Yanlış şifre veya kullanıcı adı!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        });
        buttonPanel.add(loginButton);
        buttonPanel.add(forgotButton);

        c.gridx = 0;
        c.gridy = 5;
        c.insets = new Insets(10, 0, 0, 0);
        panel.add(buttonPanel, c);

        frame.add(panel);
        frame.setVisible(true);
    }
}