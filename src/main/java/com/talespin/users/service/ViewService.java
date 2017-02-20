package com.talespin.users.service;

import java.util.List;

import org.bson.types.ObjectId;

public interface ViewService {

	List<?> searchAllData(Class<?> voName);
	
	List<?> searchAllDataWithoutCheckingStatus(Class<?> voName);

	List<?> searchByOneColumn(Class<?> voName, String column, String value);
	
	List<?> searchByTwoColumn(Class<?> voName, String column1, String value1, String column2, String value2);
	
	List<?> searchByTwoColumnOneIsIsId(Class<?> voName, String column1, String value1, String column2, ObjectId value2);
	
	List<?> searchByThreeColumn(Class<?> voName, String column1, String value1, 
			String column2, String value2, String column3, String value3);
	
	Object searchById(Class<?> voName, String idValue);
	
	Object searchByIdWithoutCheckingStatus(Class<?> voName, String idValue);
	
	List<?> searchByOneColumnOnIdWithoutCheckingStatusCaseInsensative(Class<?> voName, String column1, String value1);
	
	List<?> searchByOneColumnOnIdWithoutCheckingStatus(Class<?> voName, String column1, ObjectId value1);
	
	List<?> searchByOneColumnAndNotToAnother(Class<?> voName, String column1, String value1, String column2, String value2);
	
	List<?> searchByOneColumnCaseInsensitive(Class<?> voName, String column, String value);
	
	List<?> searchByTwoColumnCaseInsensitive(Class<?> voName, String column1, String value1, String column2, String value2);
	
	List<?> searchByTwoColumnCaseInsensitiveAndNotToOther(Class<?> voName, String column1, String value1,
			String column2, String value2, String column3, String value3);
	
	List<?> searchByTwoColumnNotToOther(Class<?> voName, String column1, String value1, String column2,
			String value2, String column3, String value3);
}
