package phillips.math.vector;

/**
 * Basic 3d vector object for future calculations
 */
public class Vector3D {
	private double x,y,z;
		
	/**
	 * Default constructor, sets x, y, and z to zero.
	 */
	public Vector3D() {
		x = y = z = 0;
	}
	
	/**
	 * Integer constructor, sets x, y, and z to the supplied a, b, and c.
	 * 
	 * @param a		Integer, the x value.
	 * @param b		Integer, the y value.
	 * @param c		Integer, the z value.
	 */
	public Vector3D(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}
		
	/**
	 * Double constructor, sets x, y, and z to the supplied a, b, and c.
	 * 
	 * @param a		Double, the x value.
	 * @param b		Double, the y value.
	 * @param c		Double, the z value.
	 */
	public Vector3D(double a, double b, double c) {
		x = a;
		y = b;
		z = c;
	}
		
	/**
	 * Called to set or change the x value with a supplied integer.
	 * 
	 * @param a		Integer, the supplied x value.
	 */
	public void setX(int a) { x = a; }
	
	/**
	 * Called to set or change the y value with a supplied integer.
	 * 
	 * @param b		Integer, the supplied y value.
	 */
	public void setY(int b) { y = b; }
	
	/**
	 * Called to set or change the z value with a supplied integer.
	 * 
	 * @param c		Integer, the supplied z value.
	 */
	public void setZ(int c) { z = c; }
	
	/**
	 * Called to set or change the x value with a supplied double.
	 * @param a		Double, the supplied x value.
	 */
	public void setX(double a) { x = a; }

	/**
	 * Called to set or change the y value with a supplied double.
	 * @param b		Double, the supplied y value.
	 */
	public void setY(double b) { y = b; }

	/**
	 * Called to set or change the z value with a supplied double.
	 * @param c		Double, the supplied z value.
	 */
	public void setZ(double c) { z = c; }
	
	/**
	 * Called to get the x value.
	 * 
	 * @return		Double, the requested x value.
	 */
	public double getX() { return x; }

	/**
	 * Called to get the y value.
	 * 
	 * @return		Double, the requested y value.
	 */
	public double getY() { return y; }

	/**
	 * Called to get the z value.
	 * 
	 * @return		Double, the requested z value.
	 */
	public double getZ() { return z; }

	/**
	 * Called to clear or reset the vector back to 0,0,0.
	 */
	public void Clear() { x=y=z=0; }
	
	/**
	 * Overrides the toString method to return the value as a string.
	 * 
	 * @return		String, the vector in string format of <x,y,z>.
	 */
	@Override
	public String toString() {
		return "<" + x + "," + y + "," + z + ">";
	}

	/**
	 * Overrides the clone method to return a basic copy of the vector.
	 * 
	 * @return		Object, the copy or new instance of the vector.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Vector3D(x,y,z);
	}
	
	/**
	 * Overrides the equals method to compare the values of x, y, and z between the current and supplied vector.
	 * 
	 * @return		Boolean, the true or false value of comparing the vector against another one.	
	 */
	@Override
	public boolean equals(Object compare) {
		if (compare == null) { return false; }
		if (compare.getClass() != this.getClass()) { return false; }
			
		final Vector3D vec = (Vector3D)compare;
		if ((this.x != vec.x) || (this.y != vec.y) || (this.z != vec.z)) { return false; }
			
		return true;
	}
}
