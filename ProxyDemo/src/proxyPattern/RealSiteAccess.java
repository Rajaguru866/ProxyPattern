package proxyPattern;

public class RealSiteAccess implements SiteAccess{

	public String name;
	
	public RealSiteAccess(String name) {
		
		this.name = name;
	}

	@Override
	public void grantAccess() {
		
		System.out.println("Access has been provided for " + name);
		
	}

}
