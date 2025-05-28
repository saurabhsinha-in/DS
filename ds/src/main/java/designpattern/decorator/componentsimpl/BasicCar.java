package designpattern.decorator.componentsimpl;

import designpattern.decorator.component.Car;

public class BasicCar implements Car{
@Override
public void assembly() {
	System.out.println("Basic Car assembly done here");
}
}
