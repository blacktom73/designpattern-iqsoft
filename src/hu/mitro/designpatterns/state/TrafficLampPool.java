package hu.mitro.designpatterns.state;

import java.util.HashMap;
import java.util.Map;


public class TrafficLampPool {

	private static TrafficLampPool onlyInstance;
	Map<String, State> statePool;

	public static TrafficLampPool getInstance() {
		if (onlyInstance == null) {
			onlyInstance = new TrafficLampPool();
		}
		return onlyInstance;
	}

	private TrafficLampPool() {
		statePool = new HashMap<>();
		statePool.put("red", new RedAndYellowState("RED"));
		statePool.put("redandyellow", new RedAndYellowState("RED-YELLOW"));
		statePool.put("yellow", new YellowState("YELLOW"));
		statePool.put("green", new GreenState("GREEN"));
	}

}
