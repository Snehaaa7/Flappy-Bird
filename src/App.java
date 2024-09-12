import javax.swing.*;
public class App {
    public static void main(String[] args) {      
        int boardwidth=360;
        int boardheight=640;

 
        JFrame frame=new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(boardwidth,boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        FlappyBird flappyBird= new FlappyBird();
        frame.add(flappyBird);
        frame.pack();// if we didnt add this width and height would have taken account the diminsions of the title bar.
        flappyBird.requestFocus();
        frame.setVisible(true);// you want your window to be visible after you have added all the settings.

    }
}
