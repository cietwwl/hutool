package cn.hutool.core.text;

import org.junit.Assert;
import org.junit.Test;

/**
 * UnicodeUtil 单元测试
 * 
 * @author looly
 *
 */
public class UnicodeUtilTest {
	@Test
	public void convertTest() {
		String s = UnicodeUtil.toUnicode("aaa123中文", true);
		Assert.assertEquals("aaa123\\u4e2d\\u6587", s);

		String s1 = UnicodeUtil.toString(s);
		Assert.assertEquals("aaa123中文", s1);
	}

	@Test
	public void convertTest2() {
		String str = "aaaa\\u0026bbbb\\u0026cccc";
		String unicode = UnicodeUtil.toString(str);
		Assert.assertEquals("aaaa&bbbb&cccc", unicode);
	}
}
