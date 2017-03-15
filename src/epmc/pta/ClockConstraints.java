package epmc.pta;

public class ClockConstraints {
	
	public static enum Relation { LessThan, LessOrEqual }
	
	public ClockConstraints(int numVars) {
		this.difference = new int[numVars + 1][numVars + 1];
		this.cmptype = new Relation[numVars + 1][numVars + 1];
	}
	
	public int [][] difference = null;
	public Relation [][] cmptype = null;

}
