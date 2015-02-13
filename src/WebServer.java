import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;


public class WebServer implements Runnable {
	private String m_name="";
	private String m_serverRoot="";
	private String m_serverIconPath="";
	private ServerSocket m_server;
	private int m_port;
	
	public WebServer()throws UnknownHostException,IOException {
		try {
			//m_name = "";
			m_serverRoot = "WWWSERVERROOT";
			m_port= 8080;
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) throws IOException{
		new Thread(new WebServer()).start();
		
	}

	@Override
	public void run() {
		byte[] test = new byte[0]; 
		
		m_name = " test";
		
		try {
			m_server = new ServerSocket(m_port);
		} catch (IOException e) {
				System.err.println("Cannot listen on port " + m_port);
				System.exit(1);
		}
		System.out.println(m_name);
		
		// TODO Auto-generated method stub

	}


}
