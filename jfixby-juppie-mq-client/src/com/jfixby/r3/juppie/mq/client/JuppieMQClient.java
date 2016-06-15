
package com.jfixby.r3.juppie.mq.client;

import com.jfixby.r3.api.ui.unit.Unit;
import com.jfixby.r3.api.ui.unit.UnitManager;

public class JuppieMQClient implements Unit {

	private JuppieMQClient (final JuppieMQClientSpecs specs) {

	}

	public JuppieMQClient newJuppieMQServer (final JuppieMQClientSpecs specs) {
		return new JuppieMQClient(specs);
	}

	public static JuppieMQClientSpecs newJuppieMQServerSpecs () {
		return new JuppieMQClientSpecs();
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
