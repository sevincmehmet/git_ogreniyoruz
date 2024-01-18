import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceInvaders extends JFrame  {

    public SpaceInvaders() {

        initUI();// Bu kod satırını mehmet ekledi

    }

    public void Sum(int a,int b){
        int top=0;
        top =a+b;
        System.out.println(top);

    }

    private void initUI() {

        //add(new Board());

        setTitle("Space Invaders");
        //setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }
}
