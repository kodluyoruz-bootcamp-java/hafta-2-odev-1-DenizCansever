
public class Samsung extends Phone implements ShareFolder, ListenMusic{

	@Override
	public void call() {
		System.out.println("You call someone with " + this.getClass().getSimpleName());
	}

	@Override
	public void sendMessage() {
		System.out.println("You send message to someone with " + this.getClass().getSimpleName());
	}

	@Override
	public void listenMusic() {
		System.out.println("You listen music with " + this.getClass().getSimpleName());
		
	}

	@Override
	public void shareFolder() {
		System.out.println("You share folder with " + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "Congrats! You have an Samsung Phone. Details of phone below...\nModel Name: " + getModelName() 
		+ "\nIMEI Number: " + getImeiNumber()
		+ "\nVersion Number: " + getVersionNumber() 
		+ "\nMemory Capacity: " + getMemoryCapacity() + " MB"
		+ "\nScreen Size: " + getScreenSize() + " INC";
	}

}
