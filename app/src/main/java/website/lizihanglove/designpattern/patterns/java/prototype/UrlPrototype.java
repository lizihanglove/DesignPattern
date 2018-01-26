package website.lizihanglove.designpattern.patterns.java.prototype;

/**
 * @author lizihanglove
 * @date 2018/1/12
 * @email one_mighty@163.com
 * @desc 原型设计模式
 */

public class UrlPrototype implements Cloneable {
    private String host;
    private String port;
    private String protocol;

    public void printUrl() {
        System.out.println("The Url is:"+protocol+"//"+host+":"+port);
    }

    @Override
    public UrlPrototype clone() {
        try {
            UrlPrototype urlPrototype = (UrlPrototype) super.clone();
            urlPrototype.host = this.host;
            urlPrototype.port = this.port;
            urlPrototype.protocol = this.protocol;
            return urlPrototype;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}
