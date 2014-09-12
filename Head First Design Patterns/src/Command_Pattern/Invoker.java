package Command_Pattern;

public class Invoker {
	Command[] commandOn;
	Command[] commandOff;

	public Invoker() {
		commandOn = new Command[4];
		commandOff = new Command[4]; // say we have 4 on and off commands
		Command noCommand = new NoCommand();
		for (int i = 0; i < commandOn.length; i++) {
			commandOn[i] = noCommand;
			commandOff[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command commandOn, Command commandOff) {
		this.commandOn[slot] = commandOn;
		this.commandOff[slot] = commandOff;
	}

	public void turnedOn(int slot) {
		commandOn[slot].execute();
	}

	public void turnedOff(int slot) {
		commandOff[slot].execute();
	}
}
