import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {

    public LoginForm() {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 300);  // Pencere boyutu
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Pencere kapatıldığında uygulama kapanacak
        frame.setLocationRelativeTo(null);  // Pencere ekranın ortasında açılacak

        // Panel düzeni
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  // Dikey düzen
        panel.setBackground(Color.WHITE);  // Panel arka planı beyaz

        // Başlık paneli
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.WHITE);  // Başlık arka planı beyaz
        JLabel titleLabel = new JLabel("Log In");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));  // Başlık fontu
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);  // Başlık ortalanmış
        titlePanel.add(titleLabel);

        // Kullanıcı adı ve şifre girişi için panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 10, 10));  // 2 satır, 2 sütun düzeni
        inputPanel.setOpaque(false);  // Arka plan şeffaf

        // Kullanıcı adı ve şifre etiketleri ile giriş alanları
        JLabel usernameLabel = new JLabel("Nick Name:");
        JTextField usernameField = new JTextField(15);  // Kullanıcı adı girişi

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);  // Şifre girişi

        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        // Buton paneli (Log In ve Forgot Password butonları)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));  // Butonlar yatayda dizili

        // Log In butonu
        JButton loginButton = new JButton("Log In");
        loginButton.setBackground(new Color(0, 200, 0));  // Yeşil buton
        loginButton.setForeground(Color.WHITE);  // Yazı rengi beyaz
        loginButton.setFont(new Font("Arial", Font.PLAIN, 14));

        // Forgot Password butonu
        JButton forgotPasswordButton = new JButton("Forgot Password");
        forgotPasswordButton.setBackground(new Color(200, 200, 200));  // Gri buton
        forgotPasswordButton.setForeground(Color.WHITE);
        forgotPasswordButton.setFont(new Font("Arial", Font.PLAIN, 12));

        // Log In butonuna tıklanıldığında giriş kontrolü
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Kullanıcı adı ve şifreleri dizi içinde tutuyoruz
                String[][] users = {
                        {"aybuke", "12345"},
                        {"aksoy", "6789"}
                };

                boolean found = false;

                // Kullanıcı adı ve şifreyi diziden kontrol ediyoruz
                for (String[] user : users) {
                    if (username.equals(user[0]) && password.equals(user[1])) {
                        found = true;
                        if (username.equals("aybuke")) {
                            new PersonnelForm();
                        } else if (username.equals("aksoy")) {
                            new AdminForm();
                        }
                        frame.dispose();
                        break; // Bulunca döngüyü durdur
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Yanlış kullanıcı adı veya şifre.", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        // Forgot Password butonuna tıklandığında hiçbir işlem yapılmaz
        forgotPasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hiçbir işlem yapılmaz
            }
        });

        // Butonları ekle
        buttonPanel.add(loginButton);
        buttonPanel.add(forgotPasswordButton);

        // Paneli düzenle
        panel.add(titlePanel);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));  // Araya boşluk ekle
        panel.add(inputPanel);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));  // Araya boşluk ekle
        panel.add(buttonPanel);

        // Frame'yi ayarla
        frame.add(panel);
        frame.setVisible(true);  // Frame görünür yap
    }

    public static void main(String[] args) {
        new LoginForm(); // Login sayfasını başlat
    }
}
