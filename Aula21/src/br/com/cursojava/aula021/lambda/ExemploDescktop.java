package br.com.cursojava.aula021.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExemploDescktop {
	
	public static void main(String[] args) {
		JFrame tela = new JFrame("Tela do sistema");
		JButton botao = new JButton("clique aqui");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(tela, "Oi, eu sou o goku!!!");
				
			}
		});
		tela.add(botao);
		tela.setSize(500, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
	}

}
