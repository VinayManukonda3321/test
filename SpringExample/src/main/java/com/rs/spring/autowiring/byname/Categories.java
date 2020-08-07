package com.rs.spring.autowiring.byname;

public class Categories {

	private String name;
	private Book bk1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBk1() {
		return bk1;
	}

	public void setBk1(Book bk1) {
		this.bk1 = bk1;
	}

	public void show()
	{
		System.out.println("Categories name :"+name);
		System.out.println("Book name :"+bk1.getBookname()+" and Book Price :"+bk1.getBookprice());
	}

}
