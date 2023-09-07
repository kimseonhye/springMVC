package ch06_pjt_01.ems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch06_pjt_01.ems.member.dao.StudentDAO;
import ch06_pjt_01.ems.member.service.PrintStudentInformationService;
import ch06_pjt_01.ems.member.service.StudentAllSelectService;
import ch06_pjt_01.ems.member.service.StudentDeleteService;
import ch06_pjt_01.ems.member.service.StudentModifyService;
import ch06_pjt_01.ems.member.service.StudentRegisterService;
import ch06_pjt_01.ems.member.service.StudentSelectService;
import ch06_pjt_01.ems.utils.InitSampleData;

@Configuration
public class MemberConfig1 {
	
	@Bean
	public StudentDAO studentDAO() {
		return new StudentDAO();
	}
	
	@Bean
	public StudentRegisterService studentRegisterService() {
		return new StudentRegisterService(studentDAO());
	}
	
	@Bean
	public StudentModifyService studentModifyService() {
		return new StudentModifyService(studentDAO());
	}
	
	@Bean
	public StudentDeleteService studentDeleteService() {
		return new StudentDeleteService(studentDAO());
	}
	
	@Bean
	public StudentSelectService studentSelectService() {
		return new StudentSelectService(studentDAO());
	}
	
	@Bean
	public StudentAllSelectService studentAllSelectService() {
		return new StudentAllSelectService(studentDAO());
	}
	
	@Bean
	public PrintStudentInformationService printStudentInformationService() {
		return new PrintStudentInformationService(studentAllSelectService());
	}
	
	@Bean
	public InitSampleData initSampleData() {

		InitSampleData initSampleData = new InitSampleData();
	
	 String[] sNums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"};
	 initSampleData.setsNums(sNums);
	
	 String[] slds = {"rabbit", "hippo", "raccoon", "elephant", "lion"};
	 initSampleData.setsIds(slds);
	
	 String[] sPws = {"p0001", "p0002", "p0003", "p0004", "p00O5"};
	 initSampleData.setsPws(sPws);
	
	 String[] sNames = {"agatha", "barbara", "chris", "doris", "elva"};
	 initSampleData.setsNames(sNames);
	
	 int[] sAges = {19, 22, 20, 27, 19};
	 initSampleData.setsAges(sAges);
	
	 char[] sGenders = {'M', 'W', 'W', 'M', 'M'};
	 initSampleData.setsGenders(sGenders);
	
	 String[] sMajors = {"English", "Korean", "French", "Philosophy", "History"};
	 initSampleData.setsMajors(sMajors);
	
	 return initSampleData;
	
	}
}
