package commandPattern;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor door = new GarageDoor();
		
		LightsOnCommand lightsOnCommand = new LightsOnCommand(light);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
		
		remote.setCommand(lightsOnCommand);
		remote.buttonWasPressed();
		remote.setCommand(garageDoorOpenCommand);
		remote.buttonWasPressed();
	}
}
