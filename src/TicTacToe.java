import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe implements ActionListener{

    Frame frame;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button exit;
    Button reset;
    boolean clicked = true;
    int draw;
    Label title;
    List<Button> buttonList = new ArrayList<>();

    public TicTacToe(){
        draw = 0;
        setFrame();
        setButtons();
        addListeners();
        addElements();
        frame.setVisible(true);
    }

    private void setFrame(){
        frame = new Frame("Tic Tac Game");
        title = new Label("TIC-TAC-TOE");
        title.setBounds(105,30,200,100);
        title.setFont(new Font("Times New Roman",Font.BOLD,30));
        title.setForeground(Color.white);
        frame.setBounds(450,150,400,500);
        frame.setLayout(null);
        frame.setBackground(Color.BLACK);
    }

    private void setButtons(){
        b1 = new Button();
        b2 = new Button();
        b3 = new Button();
        b4 = new Button();
        b5 = new Button();
        b6 = new Button();
        b7 = new Button();
        b8 = new Button();
        b9 = new Button();
        exit = new Button("Exit");
        reset = new Button("Reset");
        buttonList.add(b1);
        buttonList.add(b2);
        buttonList.add(b3);
        buttonList.add(b4);
        buttonList.add(b5);
        buttonList.add(b6);
        buttonList.add(b7);
        buttonList.add(b8);
        buttonList.add(b9);


        for(Button b : buttonList){
            b.setBackground(Color.WHITE);
            b.setForeground(Color.BLACK);
            b.setFont(new Font("Times New Roman",Font.BOLD,25));
            exit.setBackground(Color.ORANGE);
            reset.setBackground(Color.ORANGE);
            exit.setFont(new Font("Times New Roman",Font.BOLD,20));
            reset.setFont(new Font("Times New Roman",Font.BOLD,20));
        }


        //bounds
        b1.setBounds(90,150,60,60);
        b2.setBounds(90,230,60,60);
        b3.setBounds(90,310,60,60);
        exit.setBounds(50,430,70,30);
        reset.setBounds(280,430,70,30);
        b4.setBounds(170,150,60,60);
        b5.setBounds(170,230,60,60);
        b6.setBounds(170,310,60,60);
        b7.setBounds(250,150,60,60);
        b8.setBounds(250,230,60,60);
        b9.setBounds(250,310,60,60);
    }

    private void addElements(){

        for(Button b : buttonList){
            frame.add(b);
        }
        frame.add(exit);
        frame.add(reset);
        frame.add(title);
    }
    private void winCheck(){
        if(b1.getLabel().equals("X") && b2.getLabel().equals("X") && b3.getLabel().equals("X")
                || b4.getLabel().equals("X") && b5.getLabel().equals("X") && b6.getLabel().equals("X")
                || b7.getLabel().equals("X") && b8.getLabel().equals("X") && b9.getLabel().equals("X")
                || b1.getLabel().equals("X") && b5.getLabel().equals("X") && b9.getLabel().equals("X")
                || b7.getLabel().equals("X") && b5.getLabel().equals("X") && b3.getLabel().equals("X")
                || b1.getLabel().equals("X") && b4.getLabel().equals("X") && b7.getLabel().equals("X")
                || b2.getLabel().equals("X") && b5.getLabel().equals("X") && b8.getLabel().equals("X")
                || b3.getLabel().equals("X") && b6.getLabel().equals("X") && b9.getLabel().equals("X")){
            JOptionPane.showMessageDialog(null,"Player 1 Win");
            resetButtons();
        }
        else if(b1.getLabel().equals("O") && b2.getLabel().equals("O") && b3.getLabel().equals("O")
                || b4.getLabel().equals("O") && b5.getLabel().equals("O") && b6.getLabel().equals("O")
                || b7.getLabel().equals("O") && b8.getLabel().equals("O") && b9.getLabel().equals("O")
                || b1.getLabel().equals("O") && b5.getLabel().equals("O") && b9.getLabel().equals("O")
                || b7.getLabel().equals("O") && b5.getLabel().equals("O") && b3.getLabel().equals("O")
                || b1.getLabel().equals("O") && b4.getLabel().equals("O") && b7.getLabel().equals("O")
                || b2.getLabel().equals("O") && b5.getLabel().equals("O") && b8.getLabel().equals("O")
                || b3.getLabel().equals("O") && b6.getLabel().equals("O") && b9.getLabel().equals("O")){
            JOptionPane.showMessageDialog(null,"Player 2 Win");
            resetButtons();
        }
        else if (draw == buttonList.size()){
            JOptionPane.showMessageDialog(null,"Draw");
            resetButtons();
        }
    }

    private void addListeners(){
        for(Button b : buttonList){
            b.addActionListener(this);
        }
        exit.addActionListener(this);
        reset.addActionListener(this);
    }
    private void resetButtons(){
        for(Button b : buttonList){
            b.setLabel("");
            b.setEnabled(true);
        }
        clicked = true;
        draw = 0;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == exit){System.exit(0);}
        else if(e.getSource() == reset){resetButtons();}
        for (Button b : buttonList) {
            if (e.getSource() == b) {
                if (clicked) {
                    b.setLabel("X");
                    clicked = false;
                    b.setEnabled(false);
                } else {
                    b.setLabel("O");
                    clicked = true;
                    b.setEnabled(false);
                }
                draw++;
                break;
            }
        }
       winCheck();
    }

    public static void main(String[] args){new TicTacToe();}

}
