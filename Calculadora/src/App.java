import javax.swing.JFrame;

public class App extends MainPanel{
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame();
        MainPanel mainPanel = new MainPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);
        frame.add(mainPanel);
        frame.setVisible(true);


    }




}
