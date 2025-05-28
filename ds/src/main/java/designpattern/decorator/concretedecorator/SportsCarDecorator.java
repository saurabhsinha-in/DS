package designpattern.decorator.concretedecorator;

import designpattern.decorator.component.Car;
import designpattern.decorator.decorator.CarDecorator;

public class SportsCarDecorator extends CarDecorator{

	public SportsCarDecorator(Car car) {
		super(car);
	}
	
	@Override
	public void assembly() {
		
		super.assembly();
		System.out.println("Sports Car");
	}
}
