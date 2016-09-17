package com.corp.myxof.dp.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonV2Test {

	@Test
	public void testGetInstance() {
		SingletonV2 s1 = SingletonV2.getInstance();
		SingletonV2 s2 = SingletonV2.getInstance();
		assertEquals(s1, s2);
	}

}
