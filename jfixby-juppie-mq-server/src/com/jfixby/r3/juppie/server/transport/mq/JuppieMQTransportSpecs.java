
package com.jfixby.r3.juppie.server.transport.mq;

public class JuppieMQTransportSpecs {

	private String brokerServer;
	private int brokerPort;
	private String fileServer;
	private String fileServerPassword;
	private int fileServerPort;
	private String applicationIDString;

	public void setBrokerServer (final String host) {
		this.brokerServer = host;
	}

	public int getBrokerPort () {
		return this.brokerPort;
	}

	public void setBrokerPort (final int brokerPort) {
		this.brokerPort = brokerPort;
	}

	public String getBrokerServer () {
		return this.brokerServer;
	}

	public String getFileServer () {
		return this.fileServer;
	}

	public String getFileServerPassword () {
		return this.fileServerPassword;
	}

	public int getFileServerPort () {
		return this.fileServerPort;
	}

	public String getApplicationID () {
		return this.applicationIDString;
	}

	public void setFileServer (final String host) {
		this.fileServer = host;
	}

	public void setFileServerPassword (final String fileServerPassword) {
		this.fileServerPassword = fileServerPassword;
	}

	public void setFileServerPort (final int port) {
		this.fileServerPort = port;
	}

	public void setApplicationID (final String applicationIDString) {
		this.applicationIDString = applicationIDString;
	}

}
