package edu.ycp.cs320.lab02.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumbersTest {
	private Numbers model;
	@Before
	public void setUp() {
		model = new Numbers(0,0,0);
	}
	@Test
	public void testSet() {
		model.setFirst("1");
		assertEquals(model.getFirst(), "1");
		model.setSecond("2");
		assertEquals(model.getSecond(), "2");
		model.setThird("3");
		assertEquals(model.getThird(), "3");
	}
	@Test
	public void testGet() {
		model.setFirst("abc");
		assertEquals(model.getFirst(),"abc");
	}
}
