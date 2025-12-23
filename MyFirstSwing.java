import javax.swing.*;
public class MyFirstSwing{
    
    private static Object button;
    public void main(String[] args) {
        JFrame frame=new JFrame("My First Swing App");
      JButton button3=new JButton("Click");
      button3.setBounds(10,35,65,35);
      frame.add(button3);
        JButton button1=new JButton("Dashboard");
        button1.setBounds(10,5,100,30);
        JButton button2=new JButton("Send");
        button2.setBounds(150,200,70,55);
        frame.add(button2);
        frame.add(button1);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel label=new JLabel("Welcome");
        frame.add(label);
        JTextField text=new JTextField("Add Text");
        frame.add(text);
        text.setBounds(10,200,150,55);
        frame.add(label);
    }
}