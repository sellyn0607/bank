package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {
		return instance;
	}
	private MemberController() {}
	
	public void join(UserBean member) {
	
		
		System.out.println("화면에서:"+member);
		MemberServiceImpl.getInstance().createUser(member);
		
	}
	public void LIST() {
		
	}
	public void FIND_BY_ID() {
		MemberBean member = new UserBean();
		member.setUid(JOptionPane.showInputDialog("이름을 입력하세요"));
		MemberServiceImpl.getInstance().findById(member);
	}
	public void FIND_BY_NAME() {
		//JOptionPane.showMessageDialog(null, service.findByName(JOptionPane.showInputDialog("이름을 입력하세요")));
	}
	public void updataPass() {
		MemberBean member = new UserBean();
		member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
		member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
		MemberServiceImpl.getInstance().updatePass(member);
		
	}
	public void deleteMember() {
		MemberBean member = new UserBean();
		member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
		MemberServiceImpl.getInstance().deleteMember(member);
	}
		public static void main(String[] args) {
			
	}
	}
