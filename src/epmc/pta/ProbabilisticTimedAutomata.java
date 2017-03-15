package epmc.pta;

import java.util.Vector;

public class ProbabilisticTimedAutomata {
	
	public Vector<String> locations = new Vector<String>();
	public String init_location = null;
	
	public Vector<String> actions = new Vector<String>();
	public Vector<String> clocks = new Vector<String>();
	
	public boolean isTimedAutomata() {
		// TODO
		return true;
	}
}
