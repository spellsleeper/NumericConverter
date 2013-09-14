package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JToggleButton;

public class JComboBoxExt extends JComboBox {
	
	private String[] numSys={"dezimal","binär","hexadezimal"};
	
	public JComboBoxExt(){
		for(String s:numSys){
			this.addItem(s);
		}
		
		
	}

}
