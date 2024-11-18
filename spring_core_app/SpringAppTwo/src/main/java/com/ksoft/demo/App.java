package com.ksoft.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ksoft.bean.Doctor;
import com.ksoft.bean.Employ;
import com.ksoft.bean.Hospital;
import com.ksoft.bean.Patient;

public class App {
	public static void main(String[] args) {

		String configLocation = "src/main/resources/beanConfig.xml";
		ApplicationContext ac = new FileSystemXmlApplicationContext(configLocation);

		Employ employ = (Employ) ac.getBean("emp");

		System.out.println(employ.getId() + " " + employ.getName() + "  " + employ.getSalary());

		Employ employ2 = (Employ) ac.getBean("emp");

		System.out.println(employ2.getId() + " " + employ2.getName() + "  " + employ2.getSalary());

		System.out.println(employ.hashCode() + " <-----> " + employ2.hashCode());

		/*
		 * Hospital hospital = ac.getBean("hos", Hospital.class);
		 * 
		 * System.out.println(hospital); Doctor doc = hospital.getDoctor();
		 * System.out.println(doc.getRegNo() + " " + doc.getName() + " " +
		 * doc.getSpecialization());
		 * 
		 * List<Patient> patList = hospital.getPatients();
		 * System.out.println("Patient details:"); for (Patient p : patList) {
		 * System.out.println(p.getRxNo() + " " + p.getName() + " " + p.getIssue()); }
		 */
	}
}