package designpattern.decorator.decorator;

import designpattern.decorator.component.Car;

public class CarDecorator implements Car{
	
	private Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	@Override
	public void assembly() {
		this.car.assembly();
		
	}
}
