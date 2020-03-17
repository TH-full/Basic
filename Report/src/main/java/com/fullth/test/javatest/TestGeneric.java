package com.fullth.test.javatest;

import java.util.ArrayList;
import java.util.List;

//클래스와 인터페이스를 설계하는 단계에선 일반적으로 대문자 알파벳 한 문자로 표현한다.
public class TestGeneric<T> {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// list는 객체 타입으로 저장되기 떄문에 캐스팅이 필요.
		List list = new ArrayList();
		list.add("Test1");
		String str = (String) list.get(0);
		System.out.println(str);

		List<String> list2 = new ArrayList<String>();
		list2.add("Test2");
		String str2 = list2.get(0);
		System.out.println(str2);
	}
}
