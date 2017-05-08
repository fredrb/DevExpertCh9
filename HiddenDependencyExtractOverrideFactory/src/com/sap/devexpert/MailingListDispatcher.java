package com.sap.devexpert;

import java.net.ConnectException;

public class MailingListDispatcher {
    private MailService service;
    public MailStatus status;

    public MailingListDispatcher() throws ConnectException, InterruptedException {
        service = makeService();
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

    protected MailService makeService() {
        return new MailService();
    }

    public void sendMessage(String message) {

    }

    public void addRecipient(String id, String address) {

    }

}
