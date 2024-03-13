package edu.ycp.cs320.lab02.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02.model.Numbers;

public class NumbersControllerTest {
	public NumbersController controller;
	public Numbers model;
	
	@Before
	public void setup() {
		controller = new NumbersController();
		model = new Numbers(0,0,0);
		controller.setModel(model);
	}
	@Test
	public void testConstructer() {
		model = new Numbers("a", "b", "c");
		controller.setModel(model);
		assertEquals(model.getFirst(),null);
		assertEquals(model.getSecond(),null);
		assertEquals(model.getThird(),null);
	}
	@Test
	public void testAdd() {
		model = new Numbers(2, 4, 6);
		controller.setModel(model);
		assertEquals(controller.add(),12, 0.001);
	}
	@Test
	public void testMultiply() {
		model = new Numbers(12, 4);
		assertEquals(controller.multiply(),48, 0.001);
	}
}
