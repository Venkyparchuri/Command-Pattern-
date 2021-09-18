
public class PlateCommandDemo {

	public static void main(String[] args) {

		DeviceMachine paperPlates = new PaperPlate();

		StartPlatesMaking startCommand = new StartPlatesMaking(paperPlates);

		RemoteControl remoteCall = new RemoteControl(startCommand);

		remoteCall.buttonPress();

		StopPlatesMaking stopCommand = new StopPlatesMaking(paperPlates);

		RemoteControl remoteCallNew = new RemoteControl(stopCommand);
		remoteCallNew.buttonPress();

		System.out.println("\n");

		DeviceMachine plasticPlates = new PlasticPlate();

		StopPlatesMaking stop = new StopPlatesMaking(plasticPlates);

		RemoteControl remoteNew = new RemoteControl(stop);
		remoteNew.buttonPress();

		StartPlatesMaking start = new StartPlatesMaking(plasticPlates);

		RemoteControl remote = new RemoteControl(start);

		remote.buttonPress();

	}

}
