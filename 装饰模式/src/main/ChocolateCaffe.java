package main;

import com.sun.org.apache.regexp.internal.recompile;

public class ChocolateCaffe implements Coffee {

	Coffee coffe1;

	public ChocolateCaffe(Coffee coffe1) {
		super();
		this.coffe1 = coffe1;
	}

	@Override
	public String price() {

		return "加了巧克力 10元" + coffe1.price();

	}

}
