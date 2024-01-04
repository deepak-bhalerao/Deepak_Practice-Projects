package com.verify;

import static org.junit.Assert.*;

import org.junit.Test;

public class Verify {

	public static void that(String actual,String expected)
	{
		assertEquals(expected, actual);
	}
	
	public static void that(boolean actual,boolean expected)
	{
		assertEquals(expected, actual);
	}
	
	public static void that(Object actual,Object expected)
	{
		assertEquals(expected, actual);
	}
}
