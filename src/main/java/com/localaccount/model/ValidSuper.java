package com.localaccount.model;

import java.lang.reflect.Field;

import javax.persistence.Column;

import org.springframework.core.io.FileSystemResourceLoader;

public class ValidSuper {
	
	public boolean validPass(){
		Field[] fields = this.getClass().getDeclaredFields();
		for(Field field:fields){
			boolean fieldHasAnno = field.isAnnotationPresent(Column.class);
			if(fieldHasAnno){
				field.setAccessible(true);
				 try {
					Object o=field.get(this);
					if(o==null || "".equals(o.toString())){
						System.out.println(field.getName());
						return false;
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}

}
