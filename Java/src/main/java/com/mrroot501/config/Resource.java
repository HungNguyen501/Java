package com.mrroot501.config;

import java.util.ResourceBundle;

/**
 * @author mrroot501
 */
public class Resource {
    private static final String RESOURCE_FILE = "config";
    private static final ResourceBundle RESOURCE = Resource.getResource();

    private static ResourceBundle getResource() {
        try {
            return ResourceBundle.getBundle(RESOURCE_FILE);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return null;
    }

    private static String getParamValue(String key) {
        if (RESOURCE == null) return null;

        return RESOURCE.getString(key);
    }

    public static class Info {
        public static String name = Resource.getParamValue("name");
        public static String email = Resource.getParamValue("email");
        public static String nickname = Resource.getParamValue("nickname");
    }

    public static class Proxy {
        public static String host = Resource.getParamValue("proxy.host");
        public static String port = Resource.getParamValue("proxy.port");
        public static String schema = Resource.getParamValue("proxy.schema");
    }

}
