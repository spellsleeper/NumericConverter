package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import main.Convert;

public class BasicFrame extends JFrame {
	
	public static int targetVal,inputVal;
	private JButton runBtn;
	private JTextField valueTxt,targetTxt;
	private JComboBoxExt targetSystem,inputSystem;
	
	public BasicFrame(){
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.setTitle("Zahlensystem-Koverter");
		this.setSize(350, 170);
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(0, 2, 6, 3));
		//Panel
		jp.add(new JLabel("Wert"));
		jp.add(valueTxt=new JTextField());
		jp.add(new JLabel("Eingabe-Zahlensystem"));
		jp.add(inputSystem=new JComboBoxExt());
		inputSystem.addActionListener(inputSystemListener);
		jp.add(new JLabel("Ziel-Zahlensystem"));
		jp.add(targetSystem=new JComboBoxExt());
		targetSystem.addActionListener(targetSystemListener);
		this.add(jp, BorderLayout.NORTH);
		//RunBtn & Target
		runBtn=new JButton("Konvertieren");
		runBtn.addActionListener(runListener);
		this.add(runBtn,BorderLayout.CENTER);
		targetTxt=new JTextField();
		this.add(targetTxt,BorderLayout.SOUTH);
		this.centre();
		this.setVisible(true);
	}
	
	private void centre() {
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(d.width / 2 - this.getWidth() / 2,
				d.height / 2 - this.getHeight() / 2);
	}
	
	ActionListener runListener=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Convert c=new Convert();
			targetTxt.setText(c.convert(inputVal, targetVal, valueTxt.getText()));
			
		}
	};
	
	ActionListener inputSystemListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBoxExt selectedChoice = (JComboBoxExt) e.getSource();

			if ("dezimal".equals(selectedChoice.getSelectedItem())) {
				inputVal = 0;
			} else if ("binär".equals(selectedChoice.getSelectedItem())) {
				inputVal = 1;
			} else if ("hexadezimal".equals(selectedChoice.getSelectedItem())) {
				inputVal = 2;
			}

		}
	};

	ActionListener targetSystemListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBoxExt selectedChoice = (JComboBoxExt) e.getSource();

			if ("dezimal".equals(selectedChoice.getSelectedItem())) {
				targetVal = 0;
			} else if ("binär".equals(selectedChoice.getSelectedItem())) {
				targetVal = 1;
			} else if ("hexadezimal".equals(selectedChoice.getSelectedItem())) {
				targetVal = 2;
			}

		}

	};

}
