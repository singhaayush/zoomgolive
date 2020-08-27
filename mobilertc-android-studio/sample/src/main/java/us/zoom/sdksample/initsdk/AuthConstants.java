package us.zoom.sdksample.initsdk;

public interface AuthConstants {

	// TODO Change it to your web domain
	public final static String WEB_DOMAIN = "zoom.us";

	//These keys must be fetched from server and not hardcoded

	// TODO Change it to your APP Key
	public final static String APP_KEY = "InlfYluaNBiYnaLPYHwI9cVppKAN5vlMr4aq";

	// TODO Change it to your APP Secret
	public final static String APP_SECRET = "Z3dQMoQ5JJv3L0NTE3lMQwZiL8NTEXWzptzn";

	/**
	 * We recommend that, you can generate jwttoken on your own server instead of hardcore in the code.
	 * We hardcore it here, just to run the demo.
	 *
	 * You can generate a jwttoken on the https://jwt.io/
	 * with this payload:
	 * {
	 *     "appKey": "string", // app key
	 *     "iat": long, // access token issue timestamp
	 *     "exp": long, // access token expire time
	 *     "tokenExp": long // token expire time
	 * }
	 */
	//public final static String SDK_JWTTOKEN = YOUR JWTTOKEN;

}
