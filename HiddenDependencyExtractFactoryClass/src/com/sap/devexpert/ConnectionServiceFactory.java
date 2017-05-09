package com.sap.devexpert;

public class ConnectionServiceFactory {

    static private ConnectionService service = null;

    static public ConnectionService getService() {
        if (service == null) {
            service = new MailService();
        }
        return service;
    }

    static public void setService(ConnectionService s) {
        service = s;
    }

}
