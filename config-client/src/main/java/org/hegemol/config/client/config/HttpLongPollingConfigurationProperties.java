package org.hegemol.config.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.TimeUnit;

/**
 * 长轮询请求配置
 *
 * @author KevinClair
 **/
@ConfigurationProperties(prefix = "http")
public class HttpLongPollingConfigurationProperties {

    /**
     * 请求url
     */
    private String url;

    /**
     * 连接超时时间
     */
    private long connectionTimeout = TimeUnit.SECONDS.toMillis(10);

    /**
     * 写超时时间
     */
    private long writeTimeout = TimeUnit.SECONDS.toMillis(90);

    /**
     * 读超时时间
     */
    private long readTimeout = TimeUnit.SECONDS.toMillis(90);

    public HttpLongPollingConfigurationProperties(final String url, final long connectionTimeout, final long writeTimeout, final long readTimeout) {
        this.url = url;
        this.connectionTimeout = connectionTimeout;
        this.writeTimeout = writeTimeout;
        this.readTimeout = readTimeout;
    }

    public HttpLongPollingConfigurationProperties() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public long getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(final long connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public long getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(final long writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public long getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(final long readTimeout) {
        this.readTimeout = readTimeout;
    }
}
