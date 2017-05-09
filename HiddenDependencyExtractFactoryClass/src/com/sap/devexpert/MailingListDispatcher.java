package com.sap.devexpert;

import java.net.ConnectException;

public class MailingListDispatcher {
    private ConnectionService service;
    public MailStatus status;

    public MailingListDispatcher() throws ConnectException, InterruptedException {
        service = ConnectionServiceFactory.getService();
        status = MailStatus.Ok;
        final int clientType = 12;
        service.connect();
        if (service.getStatus() == ServiceStatus.Available) {
            service.register(this, clientType);
            service.setParam(clientType, "NOBOUNCE");

        } else {
            status = MailStatus.Offline;
        }
    }

    public void sendMessage(String message) {

    }

    public void addRecipient(String id, String address) {

    }

}
