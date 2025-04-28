import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminForm {

    public AdminForm() {
        JFrame frame = new JFrame("Admin Form");
        frame.setSize(400, 400);  // Pencere boyutu
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Pencere kapatıldığında sadece bu pencere kapanacak
        frame.setLocationRelativeTo(null);  // Pencere ekranın ortasında açılacak

        // Panel düzeni
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;  // Butonlar yatayda genişleyecek

        // Başlık
        JLabel titleLabel = new JLabel("Admin Dashboard");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);  // Başlık ortalanmış
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));  // Başlık fontu

        // Personel ekle, düzenle ve silme butonları
        JButton addButton = new JButton("Add Staff");
        JButton editButton = new JButton("Edit Staff");
        JButton deleteButton = new JButton("Delete Staff");

        // "Add Staff" butonuna tıklandığında hiçbir işlem yapma
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hiçbir işlem yapılmaz
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Personel silme işlemi
            }
        });

        // Butonları yerleştir
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        // Paneli düzenle
        c.gridx = 0;
        c.gridy = 1;
        panel.add(titleLabel, c);
        c.gridy = 2;
        panel.add(buttonPanel, c);

        frame.add(panel);
        frame.setVisible(true);  // Pencereyi görünür yap
    }

    public static void main(String[] args) {
        new AdminForm(); // Admin formunu başlat
    }
}
