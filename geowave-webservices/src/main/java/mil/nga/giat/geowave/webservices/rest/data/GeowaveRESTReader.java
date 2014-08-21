package mil.nga.giat.geowave.webservices.rest.data;

public class GeowaveRESTReader
{
	private static final String XML = "application/xml";
	private static final String SLD = "application/vnd.ogc.sld+xml";

	private final String restURL;
	private final String username;
	private final String password;
	
	public GeowaveRESTReader(String restURL, String username,
			String password) {
		this.restURL = HttpUtils.decurtSlash(restURL);
		this.username = username;
		this.password = password;
	}
	
	public String getStyles() {
		String url = restURL + "/rest/styles";
		return HttpUtils.get(url, XML, username, password);
	}
	
	public String getStyles(String name) {
		String url = restURL + "/rest/styles/" + name;
		return HttpUtils.get(url, SLD, username, password);
	}
}
