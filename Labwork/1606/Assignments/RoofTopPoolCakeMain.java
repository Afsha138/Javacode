
public class RoofTopPoolCakeMain extends CafeAfsha
{

	public static void main(String[] args) 
	{
		ChooseCafe();
	}
	private static void ChooseCafe()
	{
		RoofTopPoolCakeMain r1=new RoofTopPoolCafeFactory().getRooftopPoolCafe();
		if(r1!=null)
		{
			r1.WelcomeDrink();
			r1.starter();
			((SwimmingPool)r1).Chill();
			((RoofTop)r1).ambiance();
			r1.Momos();
			r1.Gravy();
			((MughalResturant)r1).ChickenLollipop();
			((MughalResturant)r1).ChickenPakoda();
		}
	}
}
