import java.io.IOException;


public class Server implements Runnable {
	private String Name;
	
	
	
	public static void main(String[] args) {
		new Thread(new Server()).start();
		
	}

	@Override
	public void run() {
		byte[] test = new byte[0]; 
		
		Name = " test";
		System.out.println(Name);
		// TODO Auto-generated method stub

	}


}
