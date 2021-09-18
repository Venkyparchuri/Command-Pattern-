
public class StartPlatesMaking implements PlateCommand {
	
	private DeviceMachine deviceMachine;

	public StartPlatesMaking(DeviceMachine device) {
		deviceMachine = device;
	}

	@Override
	public void process() {
		deviceMachine.start();
		
	}

	public DeviceMachine getDeviceMachine() {
		return deviceMachine;
	}

	public void setDeviceMachine(DeviceMachine deviceMachine) {
		this.deviceMachine = deviceMachine;
	}

}
