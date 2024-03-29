package com.booldon.mockito.mockitodemo;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.booldon.mockito.mockitodemo.business.DataService;
import com.booldon.mockito.mockitodemo.business.SomeBusinessImpl;

class SomeBusinessImplStubTest {

	@Test
	void findTheGreatestFromAllData_baicScenario() {
		DataService dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		businessImpl.findTheGreatestFromAllData();
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
	
	@Test
	void findTheGreatestFromAllData_withOneValue() {
		DataService dataServiceStub = new DataServiceStub1();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		businessImpl.findTheGreatestFromAllData();
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(35, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {25, 15, 5};
	}

	
	
}

class DataServiceStub1 implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {35};
	}

	
	
}
