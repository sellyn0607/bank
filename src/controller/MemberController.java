package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
enum MB{
	EXIT,
	JOIN,ADD,
	LIST,FIND_BY_ID,FIND_BY_NAME,COUNT,
	UPDATE,
	WITHDRAWAL
	
}
public class MemberController {

		public static void main(String[] args) {
			
			MemberBean member = null;
			
			MemberService service = new MemberServiceImpl();
			MB[] Buttons= {
				MB.EXIT,MB.JOIN,MB.ADD,MB.LIST,MB.FIND_BY_ID,MB.FIND_BY_NAME,MB.COUNT,MB.UPDATE,MB.WITHDRAWAL
				
		};
		while(true) {
			MB select = (MB)JOptionPane.showInputDialog(null,"MENU","",JOptionPane.QUESTION_MESSAGE,null,
					Buttons,Buttons[1]);
			switch(select) {
			//String uid,pass,name,ssn,addr,phone,email;
			case EXIT: return;
			case JOIN : 
				member = new UserBean();
				member.setUid(JOptionPane.showInputDialog("아이디를 입력하세요"));
				member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				member.setSsn(JOptionPane.showInputDialog("주민번호를 입력하세요"));
				member.setAddr(JOptionPane.showInputDialog("주소를 입력하세요"));
				member.setPhone(JOptionPane.showInputDialog("핸드폰번호를 입력하세요"));
				member.setEmail(JOptionPane.showInputDialog("이메일을 입력하세요"));
				service.join(member);
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
				service.join(member);
				break;
			case LIST :
				member = new MemberBean();
				JOptionPane.showMessageDialog(null,service.list(member));
				break;
			case FIND_BY_ID :
				member=	new MemberBean();
				member.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
				member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요."));
				JOptionPane.showMessageDialog(null,service.findById(member));
				break;
			case FIND_BY_NAME:
				member=	new MemberBean();
				JOptionPane.showMessageDialog(null,service.findByName(JOptionPane.showInputDialog("이름을 입력하세요")));
				
				break;
			case COUNT :
				JOptionPane.showMessageDialog(null,service.count());
				break;
			case UPDATE :
				member=	new MemberBean();
				member.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
				member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요.")+"/"
				+JOptionPane.showInputDialog("변경하실 비밀번호를 입력하세요"));
				JOptionPane.showMessageDialog(null,service.update(member));
				break;
			case WITHDRAWAL:
				member=	new MemberBean();
				member.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
				member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요.")+"/"
				+JOptionPane.showInputDialog(" 비밀번호를 재입력하세요"));
				JOptionPane.showMessageDialog(null,service.WITHDRAWAL(member) );
				break;
			}
			
		}
	}
	}
