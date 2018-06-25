package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CreateLabel {
	JTextField idTxt;
	JLabel idPan;
	public void create() {
		 idTxt = new JTextField();
		 idPan = new JLabel();
		idPan.add(idTxt);
			
		}

}
