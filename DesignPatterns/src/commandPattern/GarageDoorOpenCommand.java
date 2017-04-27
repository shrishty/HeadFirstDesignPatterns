package commandPattern;

public class GarageDoorOpenCommand implements Command {
	GarageDoor door;
	
	public GarageDoorOpenCommand(GarageDoor door)
	{
		this.door = door;
	}

	@Override
	public void execute() {
		door.up();
	}
	
	
}
