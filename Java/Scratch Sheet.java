public class Car
{
	private String name;
	private double speedmph=0;
	private double traveledMiles=0;
	
	public Car(String initName)
	{
		this.name = initName;
	}	

	public double getSpeed()
	{
		return this.speedmph;
	}
	public double getMiles()
	{
		return this.traveledMiles;
	}
	public double setSpeed(double newspeed)
	{
		return (this.speedmph=newspeed);
	}
	public double addMiles(double addedMiles)
	{
		return (this.traveledMiles+=addedMiles);
	}
	public void Accel(double increase)
	{
		if (this.getSpeed()>=0)
		{
			this.speedmph+=increase;
		}
	}	
	public void Decel(double drop)
	{
		if (this.getSpeed()>0)
		{
			this.speedmph-=drop;
		}
	}
	public void travel(double hours)
	{
		double distTraveled = this.speedmph*hours;
		System.Out.println(this.name + " has traveled an extra " + distTraveled);
		this.addMiles(this.speedmph*hours);
		System.Out.println("New Milage is " + this.traveledMiles);
	}
}