
public class DependencyInversionViolation {
	    public static void main(String[] args) {
	        Switch lightSwitch = new Switch();
	        lightSwitch.turnOn();
	    }
	}


	interface LightBulb{
	    void turnOn();
	    void turnOff();
	}

	class Switch implements LightBulb{


	    public void turnOn() {
	    	System.out.println("LightBulb is ON");
	    }

	    public void turnOff() {
	    	System.out.println("LightBulb is OFF");
	    }
	}


