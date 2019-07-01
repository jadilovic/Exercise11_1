package Exercise11_1;

public class IllegalTriangleException extends Exception{

	private double s1;
	private double s2;
	private double s3;
	
	IllegalTriangleException(double s1, double s2, double s3){
		super("Illegal Triangle Sides: " + s1 + " " + s2 + " " + s3);
		this.setS1(s1);
		this.setS2(s2);
		this.setS3(s3);
	}

	/**
	 * @return the s1
	 */
	public double getS1() {
		return s1;
	}

	/**
	 * @param s1 the s1 to set
	 */
	public void setS1(double s1) {
		this.s1 = s1;
	}

	/**
	 * @return the s2
	 */
	public double getS2() {
		return s2;
	}

	/**
	 * @param s2 the s2 to set
	 */
	public void setS2(double s2) {
		this.s2 = s2;
	}

	/**
	 * @return the s3
	 */
	public double getS3() {
		return s3;
	}

	/**
	 * @param s3 the s3 to set
	 */
	public void setS3(double s3) {
		this.s3 = s3;
	}
}
