package controller;


import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
enum AccountButt{
	EXIT,INPUT,LIST,FIND_BY_ID,FIND_BY_NAME,MINUS_ACCOUNT,MINUS_LIST,CHANGE_PASS,DELETE_ACCOUNT
}
public class AccountController {
	public static void main(String[] args) {
		
		AccountBean account = null;
		
		AccountService service = new AccountServiceImpl();
	AccountButt[] Buttons= {
			AccountButt.EXIT,AccountButt.INPUT,AccountButt.LIST,AccountButt.FIND_BY_ID,AccountButt.FIND_BY_NAME,AccountButt.MINUS_ACCOUNT,
			AccountButt.MINUS_LIST,AccountButt.CHANGE_PASS,AccountButt.DELETE_ACCOUNT
	};
	while(true) {
		AccountButt select = (AccountButt)JOptionPane.showInputDialog(null,"MENU","",JOptionPane.QUESTION_MESSAGE,null,
				Buttons,Buttons[1]);
		switch(select) {
		case EXIT: return;
		case INPUT : 
			account=	new AccountBean();
			account.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
			account.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
			account.setPass(JOptionPane.showInputDialog("패스워드를 입력하세요"));
			service.createAccount(account);	
			break;
		case LIST :
			JOptionPane.showMessageDialog(null,service.list());
			break;
		case FIND_BY_ID :
			/*
			 ID와 PASS 받아서 일치하면 계좌내역 보여줘.단 혹시모르니까 비번은 **** 처리해 
			 */
			account=	new AccountBean();
			account.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
			account.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요."));
			JOptionPane.showMessageDialog(null,service.findById(account));
			break;
		case FIND_BY_NAME:

			
			JOptionPane.showMessageDialog(null,service.findByName(JOptionPane.showInputDialog("이름을 입력하세요.")));
			
			break;
		case MINUS_ACCOUNT:
			account=new MinusAccountBean();
			account.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
			account.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
			account.setPass(JOptionPane.showInputDialog("패스워드를 입력하세요"));
			((MinusAccountBean) account).setLimit(Integer.parseInt(JOptionPane.showInputDialog("한도금액")));
			service.createAccount(account);	
			break;
		case MINUS_LIST: 
			JOptionPane.showMessageDialog(null,service.minuslist());
			break;
		case CHANGE_PASS:
			account=	new AccountBean();
			account.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
			account.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요.")+"/"+JOptionPane.showInputDialog("새로운 비밀번호를 입력하세요"));
			
			JOptionPane.showMessageDialog(null,service.changePass(account));
			break;
		case DELETE_ACCOUNT:
			//계좌삭제후 총계좌수가 1 감소해야함
			account=	new AccountBean();
			account.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
			account.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요.")+"/"+JOptionPane.showInputDialog("다시 비밀번호를 입력해주세요."));
			
			JOptionPane.showMessageDialog(null,service.delete(account));
			
			break;
		}
		
	}
}
}
