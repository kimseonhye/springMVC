package ch04_pjt_01.ems.member.service;
import ch04_pjt_01.ems.member.dao.StudentDAO;
import ch04_pjt_01.ems.member.Student;

public class StudentSelectService {
	
	private StudentDAO studentDao;
	
	public StudentSelectService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public Student select(String sNum) {
		if(verify(sNum)) {
			return studentDao.select(sNum);
		} else {
			System.out.println("Student information is available.");
			return null;
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}
}