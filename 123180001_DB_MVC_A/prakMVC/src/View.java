
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View extends JFrame{
    JButton btnLihat = new JButton("Lihat Kontak");
    JButton btnInput = new JButton("Tambah Kontak");


    public View() {
        setTitle("Data Kontak");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,400);
        
        // background.setIcon();
        
        add(btnLihat);
        btnLihat.setBounds(60, 170, 150, 20);
    }
}
