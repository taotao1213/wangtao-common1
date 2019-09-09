package com.wangtao.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void test() {
		String str = "是分散大声道阿阿斯顿按时的撒阿达"
				+ "大大达大厦萨阿萨斯沙发发生飞洒 "
				+ "的阿萨法上是否是辅导费三分发按时发撒是";
		String html = StringUtil.toHtml(str);
		System.out.println(html);
	}

	@Test
	public void testPhone() {
		String phone = "12300050230";
		boolean phone2 = StringUtil.isPhone(phone);
		System.out.println(phone2);
	}
	
	@Test
	public void testEmail() {
		String email = "12458452@qq.com";
		boolean email2 = StringUtil.isEmail(email);
		System.out.println(email2);
	}
}
