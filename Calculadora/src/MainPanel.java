import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel implements ActionListener {

    JFrame frame;
    JTextField text;
    JButton[] numButtons = new JButton[10];
    JButton[] funcButtons = new JButton[9];
    JButton add, sub, mul, div, dec, equal, del, clear, neg;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operador;

    Font font = new Font("Ink Free", Font.BOLD, 30);

    MainPanel() {
        frame = new JFrame("Calculadora em Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        text = new JTextField();
        text.setBounds(50, 25, 300, 50);
        text.setFont(font);
        text.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("X");
        div = new JButton("÷");
        dec = new JButton(".");
        equal = new JButton("=");
        del = new JButton("Delete");
        clear = new JButton("Clear");
        neg = new JButton("(-)");

        funcButtons[0] = add;
        funcButtons[1] = sub;
        funcButtons[2] = mul;
        funcButtons[3] = div;
        funcButtons[4] = dec;
        funcButtons[5] = equal;
        funcButtons[6] = del;
        funcButtons[7] = clear;
        funcButtons[8] = neg;

        for (JButton botao : funcButtons) {
            botao.addActionListener(this);
            botao.setFont(font);
            botao.setFocusable(false);

        }

        for (int i = 0; i < numButtons.length; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(font);
            numButtons[i].setFocusable(false);
        }

        del.setBounds(50, 430, 100, 50);
        clear.setBounds(150, 430, 100, 50);
        neg.setBounds(250,430,100,50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(add);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(sub);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mul);
        panel.add(dec);
        panel.add(numButtons[0]);
        panel.add(equal);
        panel.add(div);

        frame.add(panel);
        frame.add(neg);
        frame.add(clear);
        frame.add(del);
        frame.add(text);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < numButtons.length; i++) {
            if (e.getSource() == numButtons[i]) {
                text.setText(text.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == dec) {
            text.setText(text.getText().concat("."));
        }
        if (e.getSource() == add) {
            text.setText(text.getText());
            num1 = Double.parseDouble(text.getText());
            operador = '+';
            text.setText("");
        }
        if (e.getSource() == sub) {
            text.setText(text.getText());
            num1 = Double.parseDouble(text.getText());
            operador = '-';
            text.setText("");
        }
        if (e.getSource() == mul) {
            text.setText(text.getText());
            num1 = Double.parseDouble(text.getText());
            operador = '*';
            text.setText("");
        }
        if (e.getSource() == div) {
            text.setText(text.getText());
            num1 = Double.parseDouble(text.getText());
            operador = '/';
            text.setText("");
        }
        if (e.getSource() == equal) {
            num2 = Double.parseDouble(text.getText());

            switch (operador) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                default:
                    break;
            }

            text.setText(String.valueOf(result));
            num1 = result;

        }

        if (e.getSource() == clear) {
            text.setText("");
        }

        if (e.getSource() == del) {
            String str = text.getText();
            text.setText("");
            for (int i = 0; i < str.length() - 1; i++) {
                text.setText(text.getText() + str.charAt(i));
            }
        }

        if (e.getSource() == neg) {
            double temp = Double.parseDouble(text.getText());
            temp *= -1;
            text.setText(String.valueOf(temp));
        }
    }

    public static void main(String[] args) {
        new MainPanel();
    }

}