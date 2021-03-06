package br.com.drone4.model.sensor.battery;

import br.com.drone4.model.Drone;

public class StandardUsbBattery implements BatterySensor {

	private int scale = 100;
	
	private int level = 100;
	
	private double weight = 250;
	
	private double voltage = 5;
	
	private double maxPower = 10; //10W
	
	private double current = 500; //mA
	
	private double capacity = 1500; //mAh
		
	@Override
	public void updateSensor(Drone drone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public double getLevel() {
		return level;
	}

	@Override
	public double getScale() {
		return scale;
	}

	@Override
	public double getVoltage() {
		return voltage;
	}

	@Override
	public double getCapacity() {
		return capacity;
	}

	@Override
	public double getMaxPower() {
		return maxPower;
	}

	@Override
	public double current() {
		return current;
	}

}
