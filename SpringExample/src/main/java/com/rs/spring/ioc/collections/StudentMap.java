package com.rs.spring.ioc.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentMap {

	private int id;

	private String name;

	private Map data;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setData(Map data) {
		this.data = data;
	}

	public void show() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		Set s = data.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + " - " + me.getValue());
		}
	}

}
