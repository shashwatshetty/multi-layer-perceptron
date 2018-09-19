package activationfunction;

public class SigmoidalFunction implements ActivationFunction {

	@Override
	public double computeValue(double value) {
		
		return 1 / (1 + Math.pow(Math.E, - value));
	}

	@Override
	public double computeDerivate(double value) {
		
		return (value - Math.pow(value, 2));
	}

}
