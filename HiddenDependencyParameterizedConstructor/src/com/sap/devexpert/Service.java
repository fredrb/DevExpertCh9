package com.sap.devexpert;

import java.net.ConnectException;

public interface Service {
    void connect() throws ConnectException;

    ServiceStatus getStatus();

    void register(MailingListDispatcher mailingListDispatcher, int clientType) throws InterruptedException;

    void setParam(int clientType, String param);
}
