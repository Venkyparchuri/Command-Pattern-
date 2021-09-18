
public class StopPlatesMaking implements PlateCommand{
	
	private DeviceMachine deviceMachine;

	public StopPlatesMaking(DeviceMachine device) {
		deviceMachine =  device ;
	}

	@Override
	public void process() {
	 
		deviceMachine.stop();
		
	}

	public DeviceMachine getDeviceMachine() {
		return deviceMachine;
	}

	public void setDeviceMachine(DeviceMachine deviceMachine) {
		this.deviceMachine = deviceMachine;
	}

}
