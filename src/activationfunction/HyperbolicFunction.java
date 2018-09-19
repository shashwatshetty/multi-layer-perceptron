package activationfunction;

public class HyperbolicFunction implements ActivationFunction{

	@Override
	public double computeValue(double value) {
		return Math.tanh(value);
	}

	@Override
	public double computeDerivate(double value) {	
		return 1 - Math.pow(value, 2);
	}

}
