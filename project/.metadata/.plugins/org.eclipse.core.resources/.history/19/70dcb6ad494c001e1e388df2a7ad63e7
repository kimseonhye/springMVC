package ch04_pjt_01.ems.member.service;
import ch04_pjt_01.ems.member.dao.StudentDAO;
import ch04_pjt_01.ems.member.Student;

public class StudentRegisterService {

	private StudentDAO studentDao;
	
	public StudentRegisterService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public void register(Student student) {
		if(verify(student.getsNum())) {
			studentDao.insert(student);
		} else {
			System.out.println("The student has already been registered");
		}
	}
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student == null ? true : false;
	}
}
