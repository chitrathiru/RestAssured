package WithoutBDD;

public class MethodChain {
	
	String place;
	String modeoftravel;
	
	
	public String getPlace() {
		return place;
	}
	public MethodChain setPlace(String place) {
		this.place = place;
		return this;
	}
	public String getModeoftravel() {
		return modeoftravel;
	}
	public MethodChain setModeoftravel(String modeoftravel) {
		this.modeoftravel = modeoftravel;
		return this;
	}
	
	public void issue()
	{
		System.out.println(getPlace());
	}
	
public static void  main(String args[])
{
	MethodChain MC = new MethodChain();
	MC.setPlace("California");
	MC.setModeoftravel("car");
	MC.setPlace("Texas").setModeoftravel("Flight");
	
}
}
