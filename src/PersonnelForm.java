import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class PersonnelForm {
    public PersonnelForm() {
        JFrame frame = new JFrame("Personnel Information");  // Başlık "Personnel Information"
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Pencere kapatıldığında sadece bu pencere kapanacak
        frame.setLocationRelativeTo(null);  // Pencere ekranın ortasında açılacak

        // Ana panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;  // Butonlar yatayda genişleyecek

        // Başlık paneli (Kutu içinde)
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.WHITE);  // Başlık arka planı beyaz
        titlePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));  // Başlık kutusu
        JLabel titleLabel = new JLabel("Personnel Information");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));  // Başlık fontu
        titlePanel.add(titleLabel);
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 0, 10, 0);  // Başlık ile diğer elemanlar arasına boşluk
        panel.add(titlePanel, c);

        // Ad, Soyad ve Pozisyon bilgisi
        JLabel nameLabel = new JLabel("Name:");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(nameLabel, c);

        JTextField nameField = new JTextField("Aybuke");  // Sabit ad bilgisi
        c.gridx = 0;
        c.gridy = 2;
        panel.add(nameField, c);

        JLabel surnameLabel = new JLabel("Surname:");
        c.gridx = 0;
        c.gridy = 3;
        panel.add(surnameLabel, c);

        JTextField surnameField = new JTextField("Aksoy");  // Sabit soyad bilgisi
        c.gridx = 0;
        c.gridy = 4;
        panel.add(surnameField, c);

        JLabel positionLabel = new JLabel("Position:");
        c.gridx = 0;
        c.gridy = 5;
        panel.add(positionLabel, c);

        JTextField positionField = new JTextField("Personnel");  // Sabit pozisyon bilgisi
        c.gridx = 0;
        c.gridy = 6;
        panel.add(positionField, c);

        // Butonlar (Update Information ve Log Out)
        JPanel buttonPanel = new JPanel(new FlowLayout());  // Butonlar yatayda dizili

        // "Update Information" butonu (işlevsiz)
        JButton updateButton = new JButton("Update Information");
        updateButton.setBackground(Color.GREEN);
        updateButton.setForeground(Color.WHITE);
        updateButton.setEnabled(false);  // İşlevsiz, tıklanamaz

        // "Log Out" butonu (işlevli)
        JButton logoutButton = new JButton("Log Out");
        logoutButton.setBackground(Color.LIGHT_GRAY);
        logoutButton.setForeground(Color.WHITE);
        logoutButton.addActionListener(e -> frame.dispose());  // Çıkış yapma işlevi

        // Butonları ekle
        buttonPanel.add(updateButton);
        buttonPanel.add(logoutButton);

        c.gridx = 0;
        c.gridy = 7;
        panel.add(buttonPanel, c);

        // Panel boyutlandırma
        panel.setPreferredSize(new Dimension(350, 350));  // Panel boyutunu artır

        // Frame'i ekle ve göster
        frame.add(panel);
        frame.pack();  // İçeriğe göre pencereyi otomatik olarak boyutlandır
        frame.setVisible(true);  // Pencereyi görünür yap
    }
}
