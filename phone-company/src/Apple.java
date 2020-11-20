
public class Apple extends Phone implements VideoCall, ScreenShare{

	@Override
	public void call() {
		System.out.println("You call someone with using " + this.getClass().getSimpleName());
	}

	@Override
	public void sendMessage() {
		System.out.println("You send message to someone with using " + this.getClass().getSimpleName());
	}

	@Override
	public void screenShare() {
		System.out.println("You share screen with using " + this.getClass().getSimpleName());
	}

	@Override
	public void videoCall() {
		System.out.println("You make video call with using " + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "Congrats! You have an Apple Phone. Details of phone below...\nModel Name: " + getModelName() 
				+ "\nIMEI Number: " + getImeiNumber()
				+ "\nVersion Number: " + getVersionNumber() 
				+ "\nMemory Capacity: " + getMemoryCapacity() + " MB"
				+ "\nScreen Size: " + getScreenSize() + " INC";
	
		
	}
	
	

}
