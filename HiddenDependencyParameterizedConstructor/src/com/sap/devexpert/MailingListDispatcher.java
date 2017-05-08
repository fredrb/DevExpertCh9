package com.sap.devexpert;

import java.net.ConnectException;

public class MailingListDispatcher {
    private Service service;
    public MailStatus status;

    public MailingListDispatcher(Service service) throws ConnectException, InterruptedException {
        initialize(service);
    }

    public MailingListDispatcher() throws InterruptedException, ConnectException {
        initialize(new MailService());
    }

    public void sendMessage(String message) {

    }

    public void addRecipient(String id, String address) {

    }

    private void initialize(Service service) throws ConnectException, InterruptedException {
        this.service = service;
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

}
