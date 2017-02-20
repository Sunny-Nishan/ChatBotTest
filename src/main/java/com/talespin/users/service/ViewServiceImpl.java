package com.talespin.users.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talespin.users.dao.ViewDao;

@Service
public class ViewServiceImpl implements ViewService {

	@Autowired
	private ViewDao viewDao;

	@Transactional
	public List<?> searchAllData(Class<?> voName) {

		return this.viewDao.searchAllData(voName);
		
	}

	@Transactional
	public List<?> searchByOneColumn(Class<?> voName, String column, String value) {
		
		return this.viewDao.searchByOneColumn(voName, column, value);
		
	}
	
	@Transactional
	public List<?> searchByTwoColumn(Class<?> voName, String column1, String value1, String column2, String value2) {
		
		return this.viewDao.searchByTwoColumn(voName, column1, value1, column2, value2);
	}
	
	@Transactional
	public List<?> searchByTwoColumnOneIsIsId(Class<?> voName, String column1, String value1, String column2, ObjectId value2) {
		
		return this.viewDao.searchByTwoColumnOneIsIsId(voName, column1, value1, column2, value2);
	}
	
	@Transactional
	public Object searchById(Class<?> voName, String idValue) {
		
		return this.viewDao.searchById(voName, idValue);
	}
	
	@Transactional
	public Object searchByIdWithoutCheckingStatus(Class<?> voName, String idValue) {
		
		return this.viewDao.searchByIdWithoutCheckingStatus(voName, idValue);
	}
	
	@Transactional
	public List<?> searchByThreeColumn(Class<?> voName, String column1, String value1, 
			String column2, String value2, String column3, String value3) {
		
		return this.viewDao.searchByThreeColumn(voName, column1, value1, column2, value2, column3, value3);
	}
	
	@Transactional
	public List<?> searchAllDataWithoutCheckingStatus(Class<?> voName) {
		
		return this.viewDao.searchAllDataWithoutCheckingStatus(voName);
	}
	
	@Transactional
	public List<?> searchByOneColumnOnIdWithoutCheckingStatus(Class<?> voName, String column1, ObjectId value1) {
		
		return this.viewDao.searchByOneColumnOnIdWithoutCheckingStatus(voName, column1, value1);
	}
	
	@Transactional
	public List<?> searchByOneColumnAndNotToAnother(Class<?> voName, String column1, String value1, String column2, String value2) {
		
		return this.viewDao.searchByOneColumnAndNotToAnother(voName, column1, value1, column2, value2);
	}

	@Transactional
	public List<?> searchByOneColumnCaseInsensitive(Class<?> voName, String column, String value) {
		
		return this.viewDao.searchByOneColumnCaseInsensitive(voName, column, value);
	}

	@Transactional
	public List<?> searchByTwoColumnCaseInsensitive(Class<?> voName, String column1, String value1, String column2,
			String value2) {
		
		return this.viewDao.searchByTwoColumnCaseInsensitive(voName, column1, value1, column2, value2);
	}

	@Transactional
	public List<?> searchByTwoColumnCaseInsensitiveAndNotToOther(Class<?> voName, String column1, String value1,
			String column2, String value2, String column3, String value3) {
		
		return this.viewDao.searchByTwoColumnCaseInsensitiveAndNotToOther(voName, column1, value1, column2, value2, column3, value3);
	}

	@Transactional
	public List<?> searchByOneColumnOnIdWithoutCheckingStatusCaseInsensative(Class<?> voName, String column1,
			String value1) {
		
		return this.viewDao.searchByOneColumnOnIdWithoutCheckingStatusCaseInsensative(voName, column1, value1);
	}
	
	@Transactional
	public List<?> searchByTwoColumnNotToOther(Class<?> voName, String column1, String value1, String column2,
			String value2, String column3, String value3) {
		
		return this.viewDao.searchByTwoColumnNotToOther(voName, column1, value1, column2, value2, column3, value3);
	}
	
}
