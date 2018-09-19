package activationfunction;

public class HeavisideFunction implements ActivationFunction{

	@Override
	public double computeValue(double value) {
		if(value >= 0.0)
			return 1.0;
		else
			return 0.0;
	}

	@Override
	public double computeDerivate(double value) {
		return 1.0;
	}

}
