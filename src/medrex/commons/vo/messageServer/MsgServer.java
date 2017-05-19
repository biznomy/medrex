package medrex.commons.vo.messageServer;

import java.io.Serializable;

public class MsgServer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2475006618185814338L;
	String ip;
	String port;

	MsgServer() {

	}

	public MsgServer(String ip, String port) {
		this.ip = ip;
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return ip + " : " + port;
	}

}
