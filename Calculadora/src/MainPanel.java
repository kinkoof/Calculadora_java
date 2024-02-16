import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class MainPanel extends JPanel implements ActionListener {

    JTextPane text;
    JButton botao1;
    JButton botao2;
    JButton botao3;
    JButton botao4;
    JButton botao5;
    JButton botao6;
    JButton botao7;
    JButton botao8;
    JButton botao9;
    JButton botao0;
    JButton botao;
    JButton botaoMais;
    JButton botaoMenos;
    JButton botaoDivisao;
    JButton botaoMult;
    JButton botaoIgual;
    JButton botaoClean;

    int num;
    String currentText;

    MainPanel() {

        botao1 = new JButton("1");
        botao1.addActionListener(this);
        botao2 = new JButton("2");
        botao2.addActionListener(this);
        botao3 = new JButton("3");
        botao3.addActionListener(this);
        botao4 = new JButton("4");
        botao4.addActionListener(this);
        botao5 = new JButton("5");
        botao5.addActionListener(this);
        botao6 = new JButton("6");
        botao6.addActionListener(this);
        botao7 = new JButton("7");
        botao7.addActionListener(this);
        botao8 = new JButton("8");
        botao8.addActionListener(this);
        botao9 = new JButton("9");
        botao9.addActionListener(this);
        botao0 = new JButton("0");
        botao0.addActionListener(this);
        botaoMais = new JButton("+");
        botaoMais.addActionListener(this);
        botaoMenos = new JButton("-");
        botaoMenos.addActionListener(this);
        botaoDivisao = new JButton("÷");
        botaoDivisao.addActionListener(this);
        botaoMult = new JButton("x");
        botaoMult.addActionListener(this);
        botaoIgual = new JButton("=");
        botaoIgual.addActionListener(this);
        botaoClean = new JButton("C");
        botaoClean.addActionListener(this);

        JButton[] botoes = { botao7, botao8, botao9, botaoMult, botao4, botao5, botao6, botaoMenos, botao1, botao2,
                botao3, botaoMais, botaoClean, botao0, botaoIgual, botaoDivisao };

        JPanel panelTop = new JPanel();
        JPanel panelBot = new JPanel();

        panelTop.setBackground(Color.GREEN);
        panelTop.setLayout(new GridLayout());
        panelTop.setPreferredSize(new Dimension(200, 100));
        text = new JTextPane();
        text.setFont(new Font("Consolas", Font.PLAIN, 100));
        text.setForeground(Color.green);
        text.setBackground(Color.BLACK);
        text.setCaretColor(Color.green);

        panelTop.add(text);

        panelBot.setBackground(Color.blue);
        panelBot.setPreferredSize(new Dimension(200, 350));
        panelBot.setLayout(new GridLayout(4, 4, 2, 2));

        for (JButton buttons : botoes) {
            panelBot.add(buttons);

        }

        this.setOpaque(true);
        this.setBackground(Color.black);
        this.setLayout(new BorderLayout(10, 10));
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelBot, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao1) {
            currentText = text.getText();
            text.setText(currentText + "1");
        } else if (e.getSource() == botao2) {
            currentText = text.getText();
            text.setText(currentText + "2");
        } else if (e.getSource() == botao3) {
            currentText = text.getText();
            text.setText(currentText + "3");
        } else if (e.getSource() == botao4) {
            currentText = text.getText();
            text.setText(currentText + "4");
        } else if (e.getSource() == botao5) {
            currentText = text.getText();
            text.setText(currentText + "5");
        } else if (e.getSource() == botao6) {
            currentText = text.getText();
            text.setText(currentText + "6");
        } else if (e.getSource() == botao7) {
            currentText = text.getText();
            text.setText(currentText + "7");
        } else if (e.getSource() == botao8) {
            currentText = text.getText();
            text.setText(currentText + "8");
        } else if (e.getSource() == botao9) {
            currentText = text.getText();
            text.setText(currentText + "9");
        } else if (e.getSource() == botao0) {
            currentText = text.getText();
            text.setText(currentText + "0");
        } else if (e.getSource() == botaoMais) {
            currentText = text.getText();
            text.setText("+");
        } else if (e.getSource() == botaoMenos) {
            currentText = text.getText();
            text.setText("-");
        } else if (e.getSource() == botaoMult) {
            currentText = text.getText();
            text.setText("x");
        } else if (e.getSource() == botaoDivisao) {
            currentText = text.getText();
            text.setText("/");
        }

    }
}
