package br.com.drone4.model;


public class AerialDrone extends Drone {
	
	public AerialDrone(double x, double y, double z) {
		super(x, y, z);
	}

	@Override
	public void throttle(double sensitivity) {

		setOffsetY(speed*sensitivity);
		
		updateSensors();
	}
			
}

