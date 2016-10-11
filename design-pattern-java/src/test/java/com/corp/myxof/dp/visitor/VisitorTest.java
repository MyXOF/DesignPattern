package com.corp.myxof.dp.visitor;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void test() {
		ConcreteElementA a = new ConcreteElementA();
		ConcreteElementB b = new ConcreteElementB();
		
		ConcreteVisitorA visitorA = new ConcreteVisitorA();
		ConcreteVisitorB visitorB = new ConcreteVisitorB();
		
		a.Accept(visitorA);
		a.Accept(visitorB);
		
		b.Accept(visitorA);
		b.Accept(visitorB);
	}

}
