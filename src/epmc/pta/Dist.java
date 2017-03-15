package epmc.pta;

import java.util.HashMap;

public class Dist<T> {
	
	public HashMap<T, Double> probs = new HashMap<T, Double>();

	public boolean isValid() {
		Double sum = 0.0;
		for (Double prob : probs.values()) {
			sum += prob;
		}
		return (sum.equals(1));
	}
	
}
