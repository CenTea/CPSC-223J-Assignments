//The Car class. Allows for the definition of Name, Speed, and Total Miles traveled.
//Can get and set all 3 attributes.
// Accel and Decel and change the speed up or down.
// travel adds to the total miles after printing out the number of miles traveled given the hours traveled.
// travel Uses current speed.

public class Car
{
	private String name;
	private double speedmph=0;
	private double traveledMiles=0;
	
	public Car(String initName)
	{
		this.name = initName;
	}	
	public String getName()
	{
		return this.name;
	}
	public double getSpeed()
	{
		return this.speedmph;
	}
	public double getMiles()
	{
		return this.traveledMiles;
	}
	public String setName(String newName)
	{
		return (this.name=newName);
	}
	public double setSpeed(double newspeed)
	{
		return (this.speedmph=newspeed);
	}
	public double addMiles(double addedMiles)
	{
		return (this.traveledMiles+=addedMiles);
	}
	public double resetMiles()
	{
		return (this.traveledMiles=0);
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
		System.out.println(this.name + " has traveled an extra " + distTraveled+" miles.");
		this.addMiles(this.speedmph*hours);
		System.out.println("New Milage is " + this.traveledMiles+" miles.");
	}
}