package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.*;
import domain.*;
import service.*;
import serviceImpl.*;

//아이디 비밀번호 이름 
public class OpenAccount extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel topLab, idLab,passLab, nameLab;
	JTextField idTxt, passTxt, nameTxt;
	JButton addBtn;
	JPanel bottomPan, centerPan, idPan, passPan, 
		namePan;
	JComboBox<?> combo;
	String[] menu = {"통장등록","마이너스 통장 등록"};
	public OpenAccount() {
		makeGui(); //화면구성
		this.setSize(400, 300);
		this.setVisible(true);
	}
	// uid,pass,name,ssn,phone,email,addr;
	public void makeGui() {
		topLab = new JLabel("통장등록", JLabel.CENTER);
		
		combo = new JComboBox<>(menu);
		idLab = new JLabel("I D : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);
		
		passLab = new JLabel("비밀번호 : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);

		nameLab = new JLabel("이 름 : ");
		nameTxt = new JTextField(15);
		namePan = new JPanel();
		namePan.add(nameLab);
		namePan.add(nameTxt);
	

		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		centerPan.add(idPan);
		centerPan.add(passPan);
		centerPan.add(namePan);
		
		

		addBtn = new JButton("추가");
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AccountBean account = new AccountBean();
				account.setUid(idTxt.getText());
				account.setPass(passTxt.getText());
				account.setName(nameTxt.getText());
				
				
						if(((String) combo.getSelectedItem()).equals(menu[0])) {
							 AccountController.getInstance().INPUT(account);
						}else {
						//	new AdiminServiceImpl().createStaff((StaffBean) b);
						}
							
				
			}
		});
		

		bottomPan = new JPanel();
		bottomPan.add(addBtn);
		
		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	}


}