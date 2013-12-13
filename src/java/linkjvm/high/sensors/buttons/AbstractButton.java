package linkjvm.high.sensors.buttons;

import linkjvm.high.sensors.digital.AbstractDigitalSensor;

public abstract class AbstractButton implements AbstractDigitalSensor{	
	
	/**
	 * 
	 * @return
	 */
	public boolean isPressed(){
		return getValue();
	}
}
