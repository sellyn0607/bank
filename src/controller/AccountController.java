package controller;


import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
enum AccountButt{
	EXIT,INPUT
}
public class AccountController {
	public static void main(String[] args) {
		Account acc = null;
		AccountService service = new AccountServiceImpl();
	AccountButt[] Buttons= {
			AccountButt.EXIT,AccountButt.INPUT
	};
	while(true) {
		
		AccountButt select = (AccountButt)JOptionPane.showInputDialog(null,"MENU","",JOptionPane.QUESTION_MESSAGE,null,
				Buttons,Buttons[1]);
		switch(select) {
		case EXIT: return;
		
		case INPUT : 
			
			service.addList(service.createAccount( 
					JOptionPane.showInputDialog("아이디를 입력하세요."),
					JOptionPane.showInputDialog("이름을 입력하세요"),
					JOptionPane.showInputDialog("패스워드를 입력하세요")
					));
			
			JOptionPane.showMessageDialog(null,service.showResult());
			
			break;
		}
		
	}
}
	
}
