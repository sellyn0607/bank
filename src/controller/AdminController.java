package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
enum AB{
	EXIT,
	JOIN,ADD,
	LIST,FIND_BY_ID,FIND_BY_NAME,COUNT,
	UPDATE,
	REMOVE
}
public class AdminController {
	private static AdminController instance = new AdminController();
	public static AdminController getInstance() {return instance;}
	public AdminController() {}
	
		public static void main(String[] args) {
			MemberBean member = null;
			
			AB[] Buttons= {
				AB.EXIT,AB.JOIN,AB.ADD,AB.LIST,AB.FIND_BY_ID,AB.FIND_BY_NAME,AB.COUNT,AB.UPDATE,AB.REMOVE
		};
		while(true) {
			AB select = (AB)JOptionPane.showInputDialog(null,"MENU","",JOptionPane.QUESTION_MESSAGE,null,
					Buttons,Buttons[1]);
			switch(select) {
			case EXIT: return;
			case JOIN : 
				/*member = new UserBean();
				member.setUid(JOptionPane.showInputDialog("아이디를 입력하세요"));
				member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				member.setSsn(JOptionPane.showInputDialog("주민번호를 입력하세요"));
				member.setAddr(JOptionPane.showInputDialog("주소를 입력하세요"));
				member.setPhone(JOptionPane.showInputDialog("핸드폰번호를 입력하세요"));
				member.setEmail(JOptionPane.showInputDialog("이메일을 입력하세요"));
				service.createUser((UserBean) member);*/
				break;
			case ADD :
				member = new StaffBean();
				member.setUid(JOptionPane.showInputDialog("아이디를 입력하세요"));
				member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				member.setSsn(JOptionPane.showInputDialog("주민번호를 입력하세요"));
				member.setAddr(JOptionPane.showInputDialog("주소를 입력하세요"));
				member.setPhone(JOptionPane.showInputDialog("핸드폰번호를 입력하세요"));
				member.setEmail(JOptionPane.showInputDialog("이메일을 입력하세요"));
			//	service.createStaff((StaffBean) member);
				break;
			case LIST :
				//JOptionPane.showMessageDialog(null,service.list());
				break;
			case FIND_BY_ID :
				break;
			case FIND_BY_NAME:
				member = new MemberBean();
				member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				break;
			case COUNT :
				break;
			case UPDATE :
				break;
			case REMOVE:
				break;
			}
		}
	}
	}
