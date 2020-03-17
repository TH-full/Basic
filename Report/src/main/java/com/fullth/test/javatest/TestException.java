package com.fullth.test.javatest;

public class TestException {

	public static void main(String[] args) {

		String testString = "sda";

		try {
			int testException = Integer.parseInt(testString);
			System.out.println(testException);
		} catch (NumberFormatException e) {
			System.out.println("변수 testString은 정수 타입이 아닙니다.");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("기타 에러 발생");
			System.err.println(e.getMessage());
		} finally {
			System.out.println("예외에 관계 없이 이 메세지는 수행됩니다.");
		}

		System.out.println("프로그램의 마지막 수행 메세지");
	}

}
