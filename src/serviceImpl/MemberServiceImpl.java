package serviceImpl;
import domain.*;
import service.*;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] list,staffList;
	int count,addcount;
public MemberServiceImpl() {
	list =new MemberBean[5];
	//staffList =new MemberBean[5];
	count=0;
	addcount=0;
	
}
	
	
	
	@Override
	public void join(MemberBean member) {
	addlist(member);
	
	}
	@Override
	public void addlist(MemberBean member) {
		list[count++]=member;
	}

	@Override
	public MemberBean[] list(MemberBean member) {
		
		return list;
	}

	@Override
	public MemberBean[] staffList(MemberBean member) {
		return staffList;
		
	}

	

	

	@Override
	public MemberBean findById(MemberBean member) {
		MemberBean m = new MemberBean();
		for(int i=0; i<count;i++) {
			if(member.getUid().equals(list[i].getUid()) && member.getPass().equals(list[i].getPass())) {
				m=list[i];
			}
		}
		
		return m;
	}



	@Override
	public MemberBean[] findByName(String name) {
		MemberBean[] m = new MemberBean[count];
		for(int i=0;i<count;i++) {
			if(name.equals(list[i].getName())) {
				m[i]=list[i];
			}
		}
		return m;
	}



	@Override
	public String count() {
	
		return "총 회원수는 "+(count)+"입니다.";
	}



	@Override
	public String update(MemberBean member) {
		String result="";
		String pass=member.getPass().split("/")[0];
		String newPass=member.getPass().split("/")[1];
		member.setPass(pass);
		member=findById(member);
		for(int i=0;i<count;i++) {
			if(member.getUid()==null) {
				result="아이디나 비밀번호를 잘못입력하셨습니다.";
				
			}else {
				if(member.getPass().equals(pass)) {
					member.setPass(newPass);
					result="비밀번호를 재설정하셨습니다.";
				}else {
					result="비밀번호를 같게 설정하셨습니다.";
				}
			}
		}
		
		return result;
	}



	@Override
	public String WITHDRAWAL(MemberBean member) {
		String result="";
		String pass=member.getPass().split("/")[0];
		String newPass=member.getPass().split("/")[1];
		member.setPass(pass);
		member=findById(member);
		for(int i=0;i<count;i++) {
			if(member.getUid()==null) {
				result="아이디나 비밀번호를 잘못입력하셨습니다.";
				
			}else {
				if(member.getPass().equals(newPass)) {
					list[i]=list[--count];
					list[count]=null;
					result="삭제되었습니다";
				}else {
					result="비밀번호가 틀리셨습니다.";
				}
			}
		}
		
		return result;
	}



	
	

}
