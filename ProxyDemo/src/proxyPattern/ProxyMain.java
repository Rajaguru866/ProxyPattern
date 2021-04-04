package proxyPattern;

public class ProxyMain {

	public static void main(String[] args) {
		
		SiteAccess access = new ProxySiteAccess("Rajaguru",22);
		access.grantAccess();
	}

}
