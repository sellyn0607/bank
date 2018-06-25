package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {return instance;}
	private AccountController() {}
	public void INPUT(AccountBean account) {

		account.setCreateDate(AdminServiceImpl.getInstance().accountDate());
		account.setAccountNum(AdminServiceImpl.getInstance().accountNum());
		System.out.println("화면에서:"+account);
		AccountServiceImpl.getInstance().createAccount(account);
	
	}
	public void LIST () {
		//JOptionPane.showMessageDialog(null,service.list());
	}
	
	public void FIND_BY_ID() {
		AccountBean	account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디를 입력하세요"));
		//JOptionPane.showMessageDialog(null,service.findById(account));
	}
	public void  FIND_BY_NAME() {
		//JOptionPane.showMessageDialog(null,service.findByName(JOptionPane.showInputDialog("이름을 입력하세요")));
	}
	public void CHANGE_PASS() {
		AccountBean	account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디를 입력하세요"));
		account.setPass(JOptionPane.showInputDialog("비밀번호")+"/"+JOptionPane.showInputDialog("새비밀번호를 입력하세요"));
		//JOptionPane.showMessageDialog(null,service.update(account));
	}
	public void DELETE_ACCOUNT() {
		AccountBean	account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디를 입력하세요"));
		account.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
		//JOptionPane.showMessageDialog(null,service.delete(account));
	}
	
	public static void main(String[] args) {
	
	}
}
