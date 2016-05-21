
public class Elevation {
	int daysTilElevation;
	
	Elevation()	{
		System.out.println("First constructor called!");
	}
	
	Elevation(String name)	{
		System.out.println("Second constructor called! " + name);
	}
	
	Elevation(String name, int code)	{
		this();  // Calling the first constructor
		System.out.println("Third constructor called! " + name + " and " + code);
	}
	
	int calcDaysTilElevation()	{
		int elevation = 100 - daysTilElevation;
		return elevation;
	}
}
