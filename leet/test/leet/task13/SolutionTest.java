package leet.task13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution;
	
	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}
	
	@Test
	void I_test() {
		// Given
		String roman = "I";
		
		// When
		int expected = 1;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void II_test() {
		// Given
		String roman = "II";
		
		// When
		int expected = 2;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void III_test() {
		// Given
		String roman = "III";
		
		// When
		int expected = 3;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void IV_test() {
		// Given
		String roman = "IV";
		
		// When
		int expected = 4;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void V_test() {
		// Given
		String roman = "V";
		
		// When
		int expected = 5;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void VI_test() {
		// Given
		String roman = "VI";
		
		// When
		int expected = 6;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void VII_test() {
		// Given
		String roman = "VII";
		
		// When
		int expected = 7;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void VIII_test() {
		// Given
		String roman = "VIII";
		
		// When
		int expected = 8;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void IX_test() {
		// Given
		String roman = "IX";
		
		// When
		int expected = 9;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void X_test() {
		// Given
		String roman = "X";
		
		// When
		int expected = 10;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void XX_test() {
		// Given
		String roman = "XX";
		
		// When
		int expected = 20;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void XXX_test() {
		// Given
		String roman = "XXX";
		
		// When
		int expected = 30;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void XL_test() {
		// Given
		String roman = "XL";
		
		// When
		int expected = 40;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void L_test() {
		// Given
		String roman = "L";
		
		// When
		int expected = 50;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void LX_test() {
		// Given
		String roman = "LX";
		
		// When
		int expected = 60;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void LXX_test() {
		// Given
		String roman = "LXX";
		
		// When
		int expected = 70;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void LXXX_test() {
		// Given
		String roman = "LXXX";
		
		// When
		int expected = 80;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void XC_test() {
		// Given
		String roman = "XC";
		
		// When
		int expected = 90;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void C_test() {
		// Given
		String roman = "C";
		
		// When
		int expected = 100;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void CC_test() {
		// Given
		String roman = "CC";
		
		// When
		int expected = 200;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void CCC_test() {
		// Given
		String roman = "CCC";
		
		// When
		int expected = 300;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void CD_test() {
		// Given
		String roman = "CD";
		
		// When
		int expected = 400;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void D_test() {
		// Given
		String roman = "D";
		
		// When
		int expected = 500;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void DC_test() {
		// Given
		String roman = "DC";
		
		// When
		int expected = 600;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void DCC_test() {
		// Given
		String roman = "DCC";
		
		// When
		int expected = 700;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void DCCC_test() {
		// Given
		String roman = "DCCC";
		
		// When
		int expected = 800;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void CM_test() {
		// Given
		String roman = "CM";
		
		// When
		int expected = 900;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void M_test() {
		// Given
		String roman = "M";
		
		// When
		int expected = 1000;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void MM_test() {
		// Given
		String roman = "MM";
		
		// When
		int expected = 2000;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void MMM_test() {
		// Given
		String roman = "MMM";
		
		// When
		int expected = 3000;
		int actual = solution.romanToInt(roman);
		
		// Then
		assertEquals(expected, actual);
	}
	
}
