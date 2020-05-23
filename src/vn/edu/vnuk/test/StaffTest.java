package vn.edu.vnuk.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import vn.edu.vnuk.define.Define;
import vn.edu.vnuk.model.Staff;

public class StaffTest {

	Staff staff;
	private final double delta = 0.00001;

	@Before
	public void setUp() throws Exception {
		staff = new Staff.StaffBuilder(Define.latestId, Define.TYPE_OF_STAFF)
						 .setYearOfBirth(2000)
						 .setName("Cong Chien")
						 .setHometown("Da Nang")
						 .setDepartment("CSE")
						 .setPosition(Define.POSITION_OF_CHIEF)
						 .setAllowance(Define.ALLOWANCE_OF_CHIEF)
						 .setWorkDay(25)
						 .setSalaryRatio((float) 2.0)
						 .setYearOfWork(20)
						 .setMinimumWage(Define.DEFAULT_MINIMUM_WAGE)
						 .build();
	}
	
	@Test
	public void testToString() {
		assertEquals("Staff [hometown=Da Nang, department=CSE"
						+ ", salaryRatio=2.0, allowance=1000"
						+ ", position=CHIEF, workDay=25"
						+ ", yearOfWork=20, minimumWage=730.0"
						+ ", id=0, yearOfBirth=2000"
						+ ", type=2, name=Cong Chien]"
						, staff.toString());
	}
	
	@Test
	public void testSetYearOfBirth() {
		staff.setYearOfBirth(2002);
		assertEquals(2002, staff.getYearOfBirth());
	}
	
	@Test
	public void testSetName() {
		staff.setName("Vinh Quang");
		assertEquals("Vinh Quang", staff.getName());
	}
	
	@Test
	public void testSetHometown() {
		staff.setHometown("Da Nang");
		assertEquals("Da Nang", staff.getHometown());
	}
	
	@Test
	public void testSetDepartment( ) {
		staff.setDepartment("IBM");
		assertEquals("IBM", staff.getDepartment());
	}
	
	@Test
	public void testSetQualification() {
		staff.setPosition(Define.POSITION_OF_DEPUTY);
		assertEquals(Define.POSITION_OF_DEPUTY, staff.getPosition());
	}
	
	@Test
	public void testYearOfWork() {
		staff.setYearOfWork(10);
		assertEquals(10, staff.getYearOfWork());
	}
	
	@Test 
	public void testWorkDay() {
		staff.setWorkDay(30);
		assertEquals(30, staff.getWorkDay());
	}
	

	@Test
	public void testMinimumWage() {
		staff.setMinimumWage(Define.DEFAULT_MINIMUM_WAGE);
		assertEquals(730, Define.DEFAULT_MINIMUM_WAGE, delta);
	}
	
	@Test
	public void testSalaryRatio() {
		staff.setSalaryRatio((float) 5.0);
		assertEquals(5.0, staff.getSalaryRatio(), delta);
	}
	
	@Test
	public void testAllowance() {
		staff.setAllowance(Define.ALLOWANCE_OF_DEPUTY);
		assertEquals(600, Define.ALLOWANCE_OF_DEPUTY);
	}
	
	@Test
	public void testUpdate() {
		staff.update(900);
		assertEquals(900, staff.getMinimumWage(), delta);
	}
	
	@Test
	public void testGetSalary() {
		assertEquals(3210, staff.getSalary(), delta);
	}
	

}
