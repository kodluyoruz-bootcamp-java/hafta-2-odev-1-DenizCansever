
public class Main {
	public void generateIphone(String model, String imei, String version, int memory, double size, KeyBoard keyboard) {
		Apple apple = new Apple();

        apple.setModelName(model);
        apple.setImeiNumber(imei);
        apple.setVersionNumber(version);
        apple.setMemoryCapacity(memory);
        apple.setScreenSize(size);
        apple.setKeyboard(keyboard);
        System.out.println(apple.toString());
        apple.getKeyboard().read();
        apple.call();
        apple.sendMessage();
        apple.screenShare();
        apple.videoCall();
	}
	
	public void generateSamsungPhone(String model, String imei, String version, int memory, double size, KeyBoard keyboard) {
		Samsung samsung = new Samsung();

        samsung.setModelName(model);
        samsung.setImeiNumber(imei);
        samsung.setVersionNumber(version);
        samsung.setMemoryCapacity(memory);
        samsung.setScreenSize(size);
        samsung.setKeyboard(keyboard);
        System.out.println(samsung.toString());
        samsung.getKeyboard().read();
        samsung.call();
        samsung.sendMessage();
        samsung.shareFolder();
        samsung.listenMusic();
	}
	
	
	public static void main(String[] args) {
		Main test = new Main();
		
		
		
	
		
		test.generateSamsungPhone("E1190", "6668GS", "A32", 2000, 1.43, new OldKeyBoard());
		System.out.println("----------------------------------------");
		test.generateIphone("Iphone 12", "3321SS3", "B23", 32000, 6.1, new NewKeyBoard());
		
	}

}
