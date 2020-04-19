import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Controller {
    View v;

    public Controller(View View) {
        this.v = View;
        
        View.btnLihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LihatView lihatView = new LihatView();
                LihatModel lihatModel = new LihatModel();
                LihatController controller = new LihatController(lihatView, lihatModel);
            }
        });
    }
    
}
