package com.sap.devexpert;

import java.net.ConnectException;

public class MailService {
    public void connect() throws ConnectException {
        long magicNumber = Math.round(Math.random());
        if (magicNumber == 0)
            throw new ConnectException();
    }

    public ServiceStatus getStatus() {
        long magicNumber = Math.round(Math.random());
        if (magicNumber == 0)
            return ServiceStatus.Available;
        else
            return ServiceStatus.Unavailable;
    }

    public void register(MailingListDispatcher mailingListDispatcher, int clientType) throws InterruptedException {
        Thread.sleep(2000);
    }

    public void setParam(int clientType, String param) {

    }
}
