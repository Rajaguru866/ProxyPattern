package proxyPattern;

public class ProxySiteAccess implements SiteAccess{

	public String name;
	public int age;
	public SiteAccess real;

	public ProxySiteAccess(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void grantAccess() {
		
		if(real == null && age >= 14)
		{
			real = new RealSiteAccess(name);
			real.grantAccess();
		}
		else if(age >= 14)
		{
			real.grantAccess();
		}
		else
		{
			System.out.println("This site is not available for you");
		}
		
	}
}
