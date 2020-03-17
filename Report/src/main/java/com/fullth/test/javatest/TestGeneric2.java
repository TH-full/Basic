package com.fullth.test.javatest;

class Product<T, M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}	
}
class Tv{}

public class TestGeneric2 {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		//product1.setKind(new Tv ());
		product1.setModel("4K TV");
		String tvModel = product1.getModel();
		System.out.println(tvModel);
	}
}
