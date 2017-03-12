package problem1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringUtility extends JFrame implements ActionListener {
	JButton btnCount;
	JButton btnReverse;
	JButton btnRD;
	JTextField txtInput;
	JTextField txtOutput;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUtility frame = new StringUtility();
		frame.setVisible(true);
	}

	public StringUtility() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("String Utility");
		setSize(600, 400);
		btnCount = new JButton("Count Letters");
		btnCount.setBounds(50, 50, 150, 50);
		btnCount.setVisible(true);
		add(btnCount);
		btnReverse = new JButton("Reverse Letters");
		btnReverse.setBounds(50, 120, 150, 50);
		btnReverse.setVisible(true);
		add(btnReverse);
		btnRD = new JButton("Remove Duplicates");
		btnRD.setBounds(50, 190, 150, 50);
		btnRD.setVisible(true);
		add(btnRD);

		JLabel lbl1 = new JLabel("Input");
		lbl1.setBounds(250, 50, 70, 30);
		lbl1.setVisible(true);
		add(lbl1);
		JLabel lbl2 = new JLabel("Output");
		lbl2.setBounds(250, 150, 70, 30);
		lbl2.setVisible(true);
		add(lbl2);
		txtInput = new JTextField();
		txtInput.setBounds(250, 80, 250, 50);
		txtInput.setVisible(true);
		add(txtInput);
		txtOutput = new JTextField();
		txtOutput.setBounds(250, 180, 250, 50);
		txtOutput.setVisible(true);
		add(txtOutput);

		btnCount.addActionListener(this);
		btnReverse.addActionListener(this);
		btnRD.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		String str = txtInput.getText();
		StringBuilder strReverse = new StringBuilder();
		if (e.getSource() == btnCount) {
			int i = str.length();
			txtOutput.setText("" + i);
		}
		if (e.getSource() == btnReverse) {
			for (int i = str.length() - 1; i >= 0; i--) {
				strReverse.append(str.charAt(i));
			}
			txtOutput.setText(strReverse.toString());
		}
		if (e.getSource() == btnRD) {
			int count = 0;
			if(str.length()<2)
				txtOutput.setText(str);
			else{
				strReverse.append(str.charAt(0));
				for (int i = 1; i <str.length() ; i++) {
					count=0;
					char temp=str.charAt(i);
					for(int j=0; j<strReverse.length();j++){
						if(temp==strReverse.charAt(j)){
							count++;
							break;
						}							
					}
					if(count==0){
						strReverse.append(temp);
						
					}
																
				}
			}
			txtOutput.setText(strReverse.toString());
		}
	}

}
