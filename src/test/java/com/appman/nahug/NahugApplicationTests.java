package com.appman.nahug;

import com.appman.nahug.service.CatService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NahugApplicationTests {

	//if weight or calFood <= 0
	@Test
	void WhenCalculateCal_Input_0() {
		var catService = new CatService();
		assertEquals(0,catService.calculate_cal(-2L, -350L));
	}

	//less than
	@Test
	void WhenCalculateCal_InputInteger_equals_2() {
		var catService = new CatService();
		assertEquals(37,catService.calculate_cal(2L, 350L));
	}
	@Test
	void WhenCalculateCal_InputDecimal_equals_2() {
		var catService = new CatService();
		assertEquals(37,catService.calculate_cal((long) 2.25, 350L));
	}
	//more than
	@Test
	void WhenCalculateCal_InputInteger_moreThan_2() {
		var catService = new CatService();
		assertEquals(66,catService.calculate_cal(5L, 350L));
	}
	@Test
	void WhenCalculateCal_InputDecimal_moreThan_2() {
		var catService = new CatService();
		assertEquals(66,catService.calculate_cal((long) 5.25, 350L));
	}

}
