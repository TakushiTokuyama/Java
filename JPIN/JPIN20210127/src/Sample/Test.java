package Sample;

public class Test {
	public void excute(int value) throws SampleException {
		if(value < 0) {
			throw new SampleException();
		}
	}
}
