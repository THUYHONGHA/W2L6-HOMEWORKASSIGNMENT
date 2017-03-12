package problem2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RainBow extends JFrame implements ActionListener{
	JButton btnRed, btnOrange, btnYellow, btnBlue, btnGreen, btnViolet, btnIndio;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainBow frame = new RainBow();
		frame.setVisible(true);
	//	frame.setBounds(0, 0, 500, 500);
	}

	RainBow() {
		setTitle("Rain Bow");
		btnRed = new JButton();		
		btnOrange = new JButton();
		btnYellow = new JButton();
		btnBlue = new JButton();
		btnGreen = new JButton();
		btnViolet = new JButton();
		btnIndio = new JButton();				
			
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setBounds(0, 0, 800, 200);		
		btnRed.setPreferredSize(new Dimension(100, 100));
		btnYellow.setPreferredSize(new Dimension(100, 100));
		btnOrange.setPreferredSize(new Dimension(100, 100));
		btnBlue.setPreferredSize(new Dimension(100, 100));
		btnGreen.setPreferredSize(new Dimension(100, 100));
		btnViolet.setPreferredSize(new Dimension(100, 100));
		btnIndio.setPreferredSize(new Dimension(100, 100));
		
		add(btnRed);
		add(btnOrange);
		add(btnYellow);
		add(btnBlue);
		add(btnGreen);
		add(btnViolet);
		add(btnIndio);
		
		btnRed.setBackground(Color.RED);
		btnOrange.setBackground(Color.ORANGE);
		btnYellow.setBackground(Color.YELLOW);
		btnBlue.setBackground(Color.BLUE);
		btnGreen.setBackground(Color.GREEN);
		btnViolet.setBackground(new Color(75, 0, 130));
		btnIndio.setBackground(new Color(138, 43, 226));
		

		btnRed.addActionListener(this);
		btnYellow.addActionListener(this);
		btnOrange.addActionListener(this);
		btnBlue.addActionListener(this);
		btnGreen.addActionListener(this);
		btnViolet.addActionListener(this);
		btnIndio.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btnRed){
			JOptionPane.showMessageDialog(this, "Red is the color of energy and enthusiasm and it symbolizes vibrancy and security.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()==btnYellow){
			JOptionPane.showMessageDialog(this, "Yellow represents the color of the sun. This is known to be full of energy. ", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()==btnOrange){
			JOptionPane.showMessageDialog(this, "Orange symbolizes a lot of energy and wisdom. It is a very warm color, which although dynamic, is more thoughtful and controlled.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()==btnGreen){
			JOptionPane.showMessageDialog(this, "Green has always been known for being the color of fertility, in addition to its calming effect on an individual. The color green symbolizes harmony, balance, growth, and good health.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()==btnBlue){
			JOptionPane.showMessageDialog(this, "Blue is known as the color of divinity. Using the color blue in our daily lives is said to bring about peace and understanding, in addition to easy flow of communication. This color also helps to soothe and relax oneself.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()==btnViolet){
			JOptionPane.showMessageDialog(this, "Violet color is viewed as the completion as well as the beginning of the energy vibration. A deep purple symbolizes high spiritual attainment, and a pale shade symbolizes love for humanity. Typically violet has always signified royalty.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()==btnIndio){
			JOptionPane.showMessageDialog(this, "The color indigo means infinity. It also symbolizes wisdom, intuition, and self-mastery. This color is known to be the bridge between the finite and the infinite.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}
	}


}
