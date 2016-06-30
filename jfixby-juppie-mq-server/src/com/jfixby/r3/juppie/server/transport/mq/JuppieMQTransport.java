
package com.jfixby.r3.juppie.server.transport.mq;

import com.jfixby.r3.juppie.transport.api.JuppieTransport;

public class JuppieMQTransport implements JuppieTransport {

	private final String fileServer;
	private final int brokerPort;
	private final String id;
	private final String brokerServer;

	public JuppieMQTransport (final JuppieMQTransportSpecs transportSpecs) {
		this.fileServer = transportSpecs.getFileServer();
		this.brokerPort = transportSpecs.getBrokerPort();
		this.id = transportSpecs.getApplicationID();
		this.brokerServer = transportSpecs.getBrokerServer();
	}

}
