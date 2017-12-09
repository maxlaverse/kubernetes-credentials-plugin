package org.jenkinsci.plugins.kubernetes.credentials;

import java.io.IOException;

/**
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 */
public interface TokenProducer {
    String getToken(String serviceAddress, String caCertData, boolean skipTlsVerify) throws IOException;
}
