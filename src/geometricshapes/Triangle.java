package geometricshapes;

public class Triangle {

	private double xV;
	private double yV;
	private double l;
	public double XMin;
	public double YMin;
	public double XMax;
	public double YMax;
	public Triangle(double xV, double yV, double l) {
		super();
		this.xV = xV;
		this.yV = yV;
		if(l <= 0)
			throw new IllegalArgumentException("The side must be bigger than 0.");
		this.l = l;
	}
	public double getxV() {
		return xV;
	}
	public void setxV(double xV) {
		this.xV = xV;
	}
	public double getyV() {
		return yV;
	}
	public void setyV(double yV) {
		this.yV = yV;
	}
	public double getL() {
		if(l <= 0)
			throw new IllegalArgumentException("The side must be bigger than 0.");
		return l;
	}
	public void setL(double l) {
		if(l <= 0)
			throw new IllegalArgumentException("The side must be bigger than 0.");
		this.l = l;
	}
	public double getXMin() {
		return this.XMin = this.xV;
	}
	public double getYMin() {
		return YMin = this.yV;
	}
	public double getXMax() {
		return XMax = this.xV + this.l;
	}
	public double getYMax() {
		return YMax = this.yV + 1*Math.sqrt(3)/2;
	}
	
	
	@Override
	public String toString() {
		return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}
	public boolean contains(Triangle t)
	{
		boolean contain = false;
		if(this.getXMin() <= t.getXMin() && this.getYMin() <= t.getYMin() && this.getXMax() >= t.getXMax() && this.getYMax() >= t.getYMax())
				contain = true;
		return contain;		
	}
	public boolean contains(Circle c)
	{
		boolean contain = false;
		if(this.getXMin() <= c.getXMin() && this.getYMin() <= c.getYMin() && this.getXMax() >= c.getXMax() && this.getYMax() >= c.getYMax())
				contain = true;
		return contain;		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
	

}
