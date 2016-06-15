
package com.jfixby.r3.juppie.server.mq;

import com.jfixby.r3.api.ui.unit.Unit;
import com.jfixby.r3.api.ui.unit.UnitManager;

public class JuppieMQServer implements Unit {

	private JuppieMQServer (final JuppieMQServerSpecs specs) {

	}

	public JuppieMQServer newJuppieMQServer (final JuppieMQServerSpecs specs) {
		return new JuppieMQServer(specs);
	}

	public static JuppieMQServerSpecs newJuppieMQServerSpecs () {
		return new JuppieMQServerSpecs();
	}

	@Override
	public void onCreate (final UnitManager unitManager) {
	}

	@Override
	public void onStart () {
	}

	@Override
	public void onResume () {
	}

	@Override
	public void onPause () {
	}

	@Override
	public void onDestroy () {
	}

}
