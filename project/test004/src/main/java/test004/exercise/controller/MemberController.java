package test004.exercise.controller;

import test004.exercise.dao.MemberDAO;
import test004.exercise.dao.MemberDO;
import test004.exercise.view.MemberViewer;

public class MemberController {
	private MemberDAO memberDao;
	private MemberViewer memberViewer;
	
	public MemberController(MemberDAO memberDao, MemberViewer memberViewer) {
		this.memberDao = memberDao;
	}
	public void insert(MemberDO member) {
		if(verify(member.getId())) {
			memberDao.insert(member);
		} else {
			memberViewer.showMessage("This member has already been registered\n");
		}
	}
	
	public void delete(String memberId) {
		if(!verify(memberId)) {
			memberDao.delete(memberId);
		} else {
			memberViewer.showMessage("Delete failed\n");
		}
	}
	
	public void showSelectMember (String memberId) {
		if(!verify(memberId)) {
			memberViewer.showMember(memberDao.select(memberId));
		} else {
			memberViewer.showMessage("There is no member who you are looking for\n");
		}
	}
	
	public void modifySelectedMember(String memberId) {
		if(!verify(memberId)) {
			memberDao.update(memberDao.select(memberId));
		} else {
			memberViewer.showMessage("There is no member who you are trying to modify\n");
		}
	}
	
	public void showAllMembers() {
		memberViewer.showAllMembers(memberDao.getMemberDB());
	}
	
	public boolean verify(String id) {
		MemberDO member = memberDao.select(id);
		return member == null ? true : false;
	}
}
