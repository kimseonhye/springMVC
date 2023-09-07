package ch06_pjt_01.ems.member.service;
import ch06_pjt_01.ems.member.Student;
import ch06_pjt_01.ems.member.dao.StudentDAO;

public class StudentDeleteService {

	  private StudentDAO studentDao;
	  
	  public StudentDeleteService(StudentDAO studentDao) {
	    this.studentDao = studentDao;
	  }
	  
	  public void delete(String sNum) {
	    if(verify(sNum)) {
	      studentDao.delete(sNum);
	    }else {
	      System.out.println("Student information is unavailable");
	    }
	  }
	  public boolean verify(String sNum) {
	    Student student = studentDao.select(sNum);
	    return student != null ? true : false;
	  }
}
