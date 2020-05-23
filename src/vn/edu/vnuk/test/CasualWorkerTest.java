package vn.edu.vnuk.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import vn.edu.vnuk.define.Define;
import vn.edu.vnuk.model.CasualWorker;

public class CasualWorkerTest {

	CasualWorker casualworker;
	private final double delta = 0.00001;

	
	@Before
	public void setUp() throws Exception {
		casualworker = new CasualWorker.CasualWorkerBuilder(Define.latestId, Define.TYPE_OF_CASUAL_WORKER)
									   .setName("Cong Chien")
									   .setYearOfBirth(2000)
									   .setWorkDay(25)
									   .setEarningPerDay((float) 100.0)
									   .build();
	}
	
	@Test 
	public void testToString() {
		assertEquals("CasualWorker [workDay=25, earningPerDay=100.0"
							+ ", id=0, yearOfBirth=2000"
							+ ", type=3, name=Cong Chien]"
							, casualworker.toString());
	}
	
	@Test
	public void testSetYearOfBirth() {
		casualworker.setYearOfBirth(2002);
		assertEquals(2002, casualworker.getYearOfBirth());
	}
	
	@Test
	public void testSetName() {
		casualworker.setName("Vinh Quang");
		assertEquals("Vinh Quang", casualworker.getName());
	}

	@Test 
	public void testWorkDay() {
		casualworker.setWorkDay(30);
		assertEquals(30, casualworker.getWorkDay());
	}
	
	@Test
	public void testEarningPerDay() {
		casualworker.setEarningPerDay((float) 150.0);
		assertEquals(150.0, casualworker.getEarningPerDay(), delta);
	}
	
	@Test
	public void testGetSalary() {
		assertEquals(2500.0, casualworker.getSalary(), delta);
	}
	
}
