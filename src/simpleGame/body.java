package simpleGame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;

public class body {

	static JTextField input;
	
	public static void main(String[] args) {
	
		JFrame window = new JFrame("Simple game");
		JPanel panel = new JPanel();
		JButton buton1 = new JButton("less");
		JButton buton2 = new JButton("true");
		JButton buton3 = new JButton("more");
		
		JTextField txtfld = new JTextField();
		
		
		window.add(panel);
		
		panel.add(buton1);
		buton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			};
		});
		panel.add(buton2);
		buton2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		panel.add(buton3);
		buton3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		window.setSize(500, 500);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}

}
