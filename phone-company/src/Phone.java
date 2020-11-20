
public abstract class Phone {
	private String modelName, imeiNumber, versionNumber;
	private int memoryCapacity;
	private double screenSize;
	private KeyBoard keyboard;
	
	
	public abstract void call();
	public abstract void sendMessage();
	
	//Getter & Setter
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getImeiNumber() {
		return imeiNumber;
	}
	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	public String getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public int getMemoryCapacity() {
		return memoryCapacity;
	}
	public void setMemoryCapacity(int memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public KeyBoard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}
	
}
