package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import test004.exercise.controller.MemberController;
import test004.exercise.dao.MemberDAO;
import test004.exercise.utils.InitSampleData;
import test004.exercise.view.MemberViewer;

@Configuration
public class MemberConfig {
	
	@Bean
	public MemberViewer memberViewer() {
		return new MemberViewer();
	}
	
	@Bean
	public MemberDAO memberDAO() {
		return new MemberDAO();
	}
	
	@Bean
	public MemberController memberController() {
		MemberController memberController = new MemberController(memberDAO(), memberViewer());
		return memberController;
	}
	
	@Bean
	public InitSampleData initSampleData() {
		InitSampleData initSampleData = new InitSampleData();
		String[] ids = {"hbs001", "hbs002", "hbs003"};
		initSampleData.setIds(ids);
		String[] passwords = {"hbs001", "hbs002", "hbs003"};
		initSampleData.setPasswords(passwords);
		String[] contacts = {"hbs001", "hbs002", "hbs003"};
		initSampleData.setContacts(contacts);
		String[] emails = {"hbs001", "hbs002", "hbs003"};
		initSampleData.setEmails(emails);
		String[] regiseteredDates = {"hbs001", "hbs002", "hbs003"};
		initSampleData.setRegisteredDates(regiseteredDates);
		String[] modifiedDates = {"hbs001", "hbs002", "hbs003"};
		initSampleData.setModifiedDates(modifiedDates);
		
		return initSampleData;
	}
}
