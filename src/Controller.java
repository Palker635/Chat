import javax.swing.*;
import java.net.Socket;

public class Controller{



    public Controller() {

        String ip = (String) JOptionPane.showInputDialog(null,"IP?","Connect to..",JOptionPane.QUESTION_MESSAGE);
        int port = Integer.parseInt(JOptionPane.showInputDialog(null,"Port?","Connect to..",JOptionPane.QUESTION_MESSAGE));       ;
        Socket socket = null;

        try {
            socket = new Socket(ip,port);
        } catch (Exception e) {
            System.out.println("Client failed to connect");
            System.exit(0);
        }

    }
}