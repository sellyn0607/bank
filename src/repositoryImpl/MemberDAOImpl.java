package repositoryImpl;

import java.util.List;

import domain.MemberBean;
import repository.MemberDAO;

public class MemberDAOImpl implements MemberDAO{
	private static MemberDAO instance = new MemberDAOImpl();
	public static MemberDAO getInstance() {return instance;}
	private MemberDAOImpl() {}

	@Override
	public void insertMember(MemberBean member) {
		System.out.println(member);
		
	}

	@Override
	public List<MemberBean> selectMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> selectMemberByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean login(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

}
