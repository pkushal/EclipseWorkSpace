package Command_Pattern;

/**
 * In the command pattern, there is a abstract class called Command which has
 * one implementation called execute. LightOnCommand and LightOffCommand are the
 * two concrete implementation of the Command Class. These command Classes
 * encapsulate the receiver(light) and the action to be taken on the receiver...
 * decouples them. Invoker class will execute on the commands. It is the
 * waitress from the example or like the remote. By setCommand we add buttons on
 * the remote like lightOnCommand and LightOffCommand .
 * 
 * NoCommand class is used to just to instantiate the command arrays in the
 * invoker class. If we don't instantiate now, we would have to check if the
 * command is null or not.
 * 
 * MacroCommand is just another command Pattern which will execute the bunch of
 * command instead of one by one. It takes array of the command that needs to do
 * something
 * 
 * @author Kushal
 * 
 */
public class CommandPatternTester {
	public static void main(String[] args) {
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");

		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(
				livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(
				livingRoomLight);
		LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(
				kitchenLight);
		LightOffCommand kitchenRoomLightOffCommand = new LightOffCommand(
				kitchenLight);

		Invoker invoke = new Invoker();
		invoke.setCommand(0, livingRoomLightOnCommand,
				livingRoomLightOffCommand);
		invoke.setCommand(1, kitchenRoomLightOnCommand,
				kitchenRoomLightOffCommand);

		invoke.turnedOn(0);
		invoke.turnedOn(1);
		invoke.turnedOff(0);
		invoke.turnedOff(1);

		System.out
				.println("\nHold On ... I will now call the MacroCommand to all the implementaion at once ;)");

		System.out.println("\n");
		System.out.println("Party On ... turn On all the lights");
		Command[] party = { livingRoomLightOnCommand, kitchenRoomLightOnCommand };
		Command[] partyOver = { livingRoomLightOffCommand,
				kitchenRoomLightOffCommand };
		MacroCommand partyMode = new MacroCommand(party);
		partyMode.execute();
		System.out.println("\nParty Over turning all the lights now");
		MacroCommand partyOverMood = new MacroCommand(partyOver);
		partyOverMood.execute();

	}
}
