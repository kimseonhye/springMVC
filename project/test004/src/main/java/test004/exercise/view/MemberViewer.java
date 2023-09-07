package test004.exercise.view;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import test004.exercise.dao.MemberDO;

public class MemberViewer {
	public void showMessage(String line) {
		System.out.print(line);
	}
	
	public void showMember(MemberDO member) {
		this.showMessage(member.getId());
		this.showMessage(member.getPassword());
		this.showMessage(member.getContact());
		this.showMessage(member.getEmail());
		this.showMessage(member.getRegisteredDate());
		this.showMessage(member.getModifiedDate());
	}
	
	public void showAllMembers(Map<String, MemberDO> members) {
		Set<String> keys = members.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println("STUDENTS LIST STARTS --------------------");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			MemberDO member = members.get(key);
			System.out.println("sNum : " + member.getId() + "\t");
			System.out.println("| sId : " + member.getPassword() + "\t");
			System.out.println("| sPw : " + member.getContact() + "\t");
			System.out.println("| sName : " + member.getEmail() + "\t");
			System.out.println("| sAge : " + member.getRegisteredDate() + "\t");
			System.out.println("| sGender : " + member.getModifiedDate() + "\t");
		}
		System.out.println("END -----------------------------------");
	}
}
