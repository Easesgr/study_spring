package org.springframework.module.convert;

import org.springframework.core.convert.converter.Converter;

public class StudentConvertor implements Converter<String, Student> {
	@Override
	public Student convert(String source) {
		System.out.println("----");
		Student student = new Student();
		String[] s = source.split("_");
		student.setId(s[0]);
		student.setName(s[1]);
		return student;
	}
}
