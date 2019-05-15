package com.runoob;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yyj
 * @version CreateTime：2019年1月16日 下午2:44:14 统计一行字符串中每个字符出现次数的函数
 */
public class Temp {
	public static void main(String[] args) {

		String str = "abbcccddddeeeeeffffffggggggg";
		char[] c = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c1 : c) {
			if (!map.containsKey(c1)) {
				map.put(c1, 1);
			} else {
				int count = map.get(c1) + 1;
				map.put(c1, count);
			}
		}
		for (char d : map.keySet()) {
			System.out.println("字母" + d + "出现了" + map.get(d) + "次");
		}

	}
}
