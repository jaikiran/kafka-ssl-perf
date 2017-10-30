package net.jaikiran.wildfly.openssl.java.agent;

public class OpenSSLEnabler {

	public static void premain(final String agentArgs) throws Exception {
		try {
			org.wildfly.openssl.OpenSSLProvider.register();
		} catch(Exception e) {
			System.err.println("Failed to register WildFly OpenSSL provider");
			e.printStackTrace();
		}
	}
}