package ch05_pjt_01.contact.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDAO;

public class ContactRegisterService {
	
	@Inject
	@Named("contactDAO")
	private ContactDAO contactDao;
	
	public ContactRegisterService(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
	
//	public ContactRegisterService() {
//		System.out.println("default constructor");
//	}
	
//	@Autowired
//	public ContactRegisterService(ContactDAO contactDao) {
//		System.out.println("contactDao : " + contactDao);
//		this.contactDao = contactDao;
//	}
	
	public void register(ContactSet contactSet) {
		String name = contactSet.getName();
		if (verify(name)) {
			contactDao.insert(contactSet);
		} else {
			System.out.println("The name has already registered.");
		}
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet == null ? true :false;
	}
	
	public void setWordDao(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}

}
