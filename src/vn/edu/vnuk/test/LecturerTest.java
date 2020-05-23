package vn.edu.vnuk.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vn.edu.vnuk.define.Define;
import vn.edu.vnuk.model.Lecturer;

public class LecturerTest {
	
	Lecturer lecturer;
	private final double delta = 0.00001;
	
	@Before
	public void setUp() throws Exception {
		lecturer = new Lecturer.LecturerBuilder(Define.latestId, Define.TYPE_OF_LECTURER)
							   .setYearOfBirth(2000)
							   .setName("Cong Chien")
							   .setHometown("Da Nang")
							   .setDepartment("CSE")
							   .setQualification(Define.QUALIFICATION_OF_MASTER)
							   .setYearOfWork(30)
							   .setPeriodsInMonth(29)
							   .setMinimumWage(Define.DEFAULT_MINIMUM_WAGE)
							   .setSalaryRatio((float) 3.0)
							   .setAllowance(Define.ALLOWANCE_OF_MASTER)
							   .build();
	}
	
	
	@Test
	public void testGetId() {
		assertEquals(0, lecturer.getId());
	}
	
	@Test
	public void testGetType() {
		assertEquals(Define.TYPE_OF_LECTURER, lecturer.getType());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Cong Chien", lecturer.getName());
	}
	
	@Test
	public void testGetYearOfBirth() {
		assertEquals(2000, lecturer.getYearOfBirth());
	}
	
	@Test
	public void testToString() {
		assertEquals("Lecturer [hometown=Da Nang, department=CSE"
						+ ", qualification=MASTER, allowance=900"
						+ ", periodsInMonth=29, salaryRatio=3.0"
						+ ", yearOfWork=30, minimumWage=730.0"
						+ ", id=0, yearOfBirth=2000"
						+ ", type=1, name=Cong Chien]"
						, lecturer.toString());
	}
	
	@Test
	public void testSetYearOfBirth() {
		lecturer.setYearOfBirth(1998);
		assertEquals(1998, lecturer.getYearOfBirth());
	}
	
	@Test
	public void testSetName() {
		lecturer.setName("Vinh Quang");
		assertEquals("Vinh Quang", lecturer.getName());
	}
	
	@Test
	public void testSetHometown() {
		lecturer.setHometown("Da Nang");
		assertEquals("Da Nang", lecturer.getHometown());
	}
	
	@Test
	public void testSetDepartment( ) {
		lecturer.setDepartment("IBM");
		assertEquals("IBM", lecturer.getDepartment());
	}
	
	@Test
	public void testSetQualification() {
		lecturer.setQualification(Define.QUALIFICATION_OF_BACHELOR);
		assertEquals(Define.QUALIFICATION_OF_BACHELOR, lecturer.getQualification());
	}
	
	@Test
	public void testYearOfWork() {
		lecturer.setYearOfWork(10);
		assertEquals(10, lecturer.getYearOfWork());
	}
	
	@Test 
	public void testPeriodsInMonth() {
		lecturer.setPeriodsInMonth(100);
		assertEquals(100, lecturer.getPeriodsInMonth());
	}
	

	@Test
	public void testMinimumWage() {
		lecturer.setMinimumWage(Define.DEFAULT_MINIMUM_WAGE);
		assertEquals(730, Define.DEFAULT_MINIMUM_WAGE, delta);
	}
	
	@Test
	public void testSalaryRatio() {
		lecturer.setSalaryRatio((float) 5.0);
		assertEquals(5.0, lecturer.getSalaryRatio(), delta);
	}
	
	@Test
	public void testAllowance() {
		lecturer.setAllowance(Define.ALLOWANCE_OF_BACHELOR);
		assertEquals(300, Define.ALLOWANCE_OF_BACHELOR);
	}
	
	@Test
	public void testUpdate() {
		lecturer.update(900);
		assertEquals(900, lecturer.getMinimumWage(), delta);
	}
	
	@Test
	public void testGetSalary() {
		assertEquals(4395, lecturer.getSalary(), delta);
	}
	
}
