package com.nicolatesser.v2.stringproblems;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringManipulationAlgorithmsTest {

	@Test
	public void testFirstNotRepeatedCharacter_Total() {
		String input = "total";
		char output = StringManipulationAlgorithms.firstNotRepeatedCharacter(input);
		Assert.assertEquals('o',output);
	}

	@Test
	public void testFirstNotRepeatedCharacter_Teeter() {
		String input = "teeter";
		char output = StringManipulationAlgorithms.firstNotRepeatedCharacter(input);
		Assert.assertEquals('r',output);
	}
	
	@Test
	public void testFirstNotRepeatedCharacter_LargerAlphabet_FürFarm() {
		String input = "fürfarm";
		char output = StringManipulationAlgorithms.firstNotRepeatedCharacter(input);
		Assert.assertEquals('ü',output);
	}
	
	@Test
	public void testFirstNotRepeatedCharacter_Unicode_StrangeCharacter() {
		String input = "f€rfarm";
		char output = StringManipulationAlgorithms.firstNotRepeatedCharacter(input);
		Assert.assertEquals('€',output);
	}
	
}
