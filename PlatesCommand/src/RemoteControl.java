
public class RemoteControl {
	
	private PlateCommand plateCommand ;

	public PlateCommand getPlateCommand() {
		return plateCommand;
	}

	public void setPlateCommand(PlateCommand plateCommand) {
		this.plateCommand = plateCommand;
	}

	public RemoteControl(PlateCommand plateCommand) {
		 
		this.plateCommand = plateCommand;
	}
	
	public void buttonPress() {
		plateCommand.process();
	}
	
	

}
