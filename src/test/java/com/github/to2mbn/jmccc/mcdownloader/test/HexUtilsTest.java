package com.github.to2mbn.jmccc.mcdownloader.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.github.to2mbn.jmccc.mcdownloader.util.HexUtils;

public class HexUtilsTest {

	@Test
	public void testEmptyHexToBytes() {
		assertArrayEquals(HexUtils.hexToBytes(""), new byte[0]);
	}

	@Test
	public void testEmptyBytesToHex() {
		assertEquals(HexUtils.bytesToHex(new byte[0]), "");
	}

	@Test
	public void testHexToBytes() {
		assertArrayEquals(HexUtils.hexToBytes("000c82756fd54e40cb236199f2b479629d0aca2f"), new byte[] { 0, 12, -126, 117, 111, -43, 78, 64, -53, 35, 97, -103, -14, -76, 121, 98, -99, 10, -54, 47 });
	}

	@Test
	public void testBytesToHex() {
		assertEquals(HexUtils.bytesToHex(new byte[] { 0, 12, -126, 117, 111, -43, 78, 64, -53, 35, 97, -103, -14, -76, 121, 98, -99, 10, -54, 47 }), "000c82756fd54e40cb236199f2b479629d0aca2f");
	}
}
