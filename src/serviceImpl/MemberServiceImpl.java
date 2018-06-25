package serviceImpl;
import java.util.*;
import repository.*;
import repositoryImpl.*;

import javax.swing.*;

import domain.*;
import service.*;

public class MemberServiceImpl implements MemberService{
//	List<MemberBean> list;
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}
	@Override
	public MemberBean findById(MemberBean member) {
		
		return null;//map.get(member.getUid());
		
	}

	@Override
	public void updatePass(MemberBean member) {
		//list.get(list.indexOf(search(member))).setPass(member.getPass());
	}
	@Override
	public void deleteMember(MemberBean member) {
		//list.remove(list.indexOf(search(member)));
		
	}
	@Override
	public String login(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser(UserBean user ) {
		
		user.setCreditRating("7등급");
		System.out.println("컨트롤러에서 넘어온 객체 :"+user);
		MemberDAOImpl.getInstance().insertMember(user);
		
		
		
	}
	

}
