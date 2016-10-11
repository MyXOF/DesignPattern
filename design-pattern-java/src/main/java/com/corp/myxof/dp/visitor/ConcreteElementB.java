package com.corp.myxof.dp.visitor;

public class ConcreteElementB extends Element{

	@Override
	public void Accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}
	
	@Override
	public String toString(){
		return "ConcreteElementB";
	}
}
