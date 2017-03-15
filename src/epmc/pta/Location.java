package epmc.pta;

import java.util.HashMap;
import java.util.Vector;

class Transition {
	public Vector<Integer> rstClocks;
	public Location nextLoc;
}

/**
 * 
 * @author YI LI
 *
 */
public class Location {

	public String identifier;
	public ClockConstraints inv;
	public HashMap<String, ClockConstraints> enab;
	public HashMap<String, Dist<Transition>> prob;
	
	/**
	 * corresponding to <i>L</i> in the paper
	 */
	public Vector<String> labels;
	
}
