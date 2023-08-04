package phillips.math.vector;

/**
 * Personal library for calculus related equations to be expanded on as needed.
 */
public class Calculus {
	/**
	 * Default constructor for Calculus class to make it easier to use.
	 */
	public Calculus() {}
	
	/**
	 * Calculates the magnitude or length of a 3d vector from zero.
	 * 
	 * @param vector	Vector3D, the vector to calculate the magnitude from.
	 * @return			Double, the magnitude or length of the vector from zero.
	 */
	public double CalculateMagnitude(Vector3D vector) {
		double x = vector.getX();
		double y = vector.getY();
		double z = vector.getZ();
		
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	/**
	 * Calculates the magnitude or length between two vectors.
	 * 
	 * @param vectorOne		Vector3D, the origin vector. 
	 * @param vectorTwo		Vector3D, the end vector.
	 * @return				Double, the magnitude or length between vectorOne and vectorTwo.
	 */
	public double CalculateMagnitude(Vector3D vectorOne, Vector3D vectorTwo) {
		double X = vectorTwo.getX() - vectorOne.getX();
		double Y = vectorTwo.getY() - vectorOne.getY();
		double Z = vectorTwo.getZ() - vectorOne.getZ();
		
		return Math.sqrt(X*X + Y*Y + Z*Z);
	}
	
	/**
	 * Calculates the normal of a vector.
	 * 
	 * @param vector	Vector3D, the vector to be normalized.
	 * @return			Vector3D, the normalized vector.
	 */
	public Vector3D CalculateNormal(Vector3D vector) {
		double mag = CalculateMagnitude(vector);
			
		return new Vector3D(vector.getX()/mag, vector.getY()/mag, vector.getZ()/mag);
	}

	/**
	 * Calculates the cross product, or normal vector, of two supplied vectors.
	 * 
	 * @param vectorOne		Vector3D, the first vector.
	 * @param vectorTwo		Vector3D, the second vector.
	 * @return				Vector3D, the cross product or normal vector of the supplied vectors.
	 */
	public Vector3D CalculateCrossProduct(Vector3D vectorOne, Vector3D vectorTwo) {
		double x1 = vectorOne.getX();
		double y1 = vectorOne.getY();
		double z1 = vectorOne.getZ();
		
		double x2 = vectorTwo.getX();
		double y2 = vectorTwo.getY();
		double z2 = vectorTwo.getZ();
		
		return new Vector3D((y1 * z2) - (z1 * y2),
							(z1 * x2) - (x1 * z2),
							(x1 * y2) - (y1 * x2));
	}
		
	/**
	 * Calculates the dot product of two vectors.
	 * 
	 * @param vectorOne		Vector3D, the first vector.
	 * @param vectorTwo		Vector3D, the second vector.
	 * @return				Double, the dot product of the two vectors.
	 */
	public double CalculateDotProduct(Vector3D vectorOne, Vector3D vectorTwo) {
		return (vectorOne.getX() * vectorTwo.getX() + vectorOne.getY() * vectorTwo.getY() + vectorOne.getZ() * vectorTwo.getZ());
	}
	/**
	 * To be updated later with tail shifting to correcting calculate the angle between the two vectors.
	 */
	/*
	double calculateRadians(Vector3D vectorOne, Vector3D vectorTwo) {
		double a = CalculateDotProduct(vectorOne, vectorTwo);
		double b = CalculateMagnitude(vectorOne) * CalculateMagnitude(vectorTwo);
						
		return Math.acos(a/b);
	}
		
	double calculateDegrees(Vector3D vectorOne, Vector3D vectorTwo) {
		return calculateRadians(vectorOne, vectorTwo) * (180/Math.PI);
	}*/
}
