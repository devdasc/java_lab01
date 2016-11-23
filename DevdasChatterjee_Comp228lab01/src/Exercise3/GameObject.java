
package Exercise3;

public class GameObject {
		// instance variables
		private double xCoordinate;
		private double yCoordinate;
		private double velocity;
		private String objectState;
		private int rotation;
		String finalPosition="";
		double rotateAngle;
		// constructor		
		public GameObject(double xCoordinate, double yCoordinate, double velocity, String objectState,int rotation) 
		{
			this.xCoordinate = xCoordinate;
			this.yCoordinate = yCoordinate;
			this.velocity = velocity;
			this.objectState = objectState;
			this.rotation = rotation;
		}
// properties
		public double getxCoordinate() {
			return xCoordinate;
		}

		public void setxCoordinate(double xCoordinate) {
			this.xCoordinate = xCoordinate;
		}

		public double getyCoordinate() {
			return yCoordinate;
		}

		public void setyCoordinate(double yCoordinate) {
			this.yCoordinate = yCoordinate;
		}

		public double getVelocity() {
			return velocity;
		}

		public void setVelocity(double velocity) {
			this.velocity = velocity;
		}

		public String getObjectState() {
			return objectState;
		}

		public void setObjectState(String objectState) {
			this.objectState = objectState;
		}

		public int getRotation() {
			return rotation;
		}

		public void setRotation(int rotation) {
			this.rotation = rotation;
		}

		// output format string
		public String getGameObjectInfo()
		{
			return finalPosition="Object Center:\n X: "+xCoordinate+"\n Y: "+yCoordinate+"\nVelocity: "
			+velocity+"\nObject State: "+objectState+"\nRotation: "+rotation+" degree"; 	
		}
}
