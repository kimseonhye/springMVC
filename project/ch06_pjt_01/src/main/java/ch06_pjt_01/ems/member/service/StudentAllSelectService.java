package ch06_pjt_01.ems.member.service;
import java.util.Map;

import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDAO;

public class StudentAllSelectService {

	private StudentDAO studentDao;
	
	public StudentAllSelectService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}
}
