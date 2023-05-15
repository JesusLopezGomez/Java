package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class testNumbers {

	@ParameterizedTest
	@ValueSource(ints = {1,3,5,2,15,Integer.MAX_VALUE})
	void testEsParIncorrecto(int number) {
		assertTrue(Numbers.esPar(number));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,12,Integer.MIN_VALUE})
	void testEsParCorrecto(int number) {
		assertTrue(Numbers.esPar(number));
	}

	@ParameterizedTest
	@CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
	void toLowerCase_Correcto(String input, String expected) {
	    String actualValue = input.toLowerCase();
	    assertEquals(expected, actualValue);
	}
	
}
