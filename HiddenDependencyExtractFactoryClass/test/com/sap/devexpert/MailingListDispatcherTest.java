package com.sap.devexpert;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.ConnectException;

import static org.junit.Assert.*;

class FakeService implements ConnectionService {

    @Override
    public void connect() throws ConnectException {

    }

    @Override
    public ServiceStatus getStatus() {
        return ServiceStatus.Available;
    }

    @Override
    public void register(MailingListDispatcher mailingListDispatcher, int clientType) throws InterruptedException {

    }

    @Override
    public void setParam(int clientType, String param) {

    }
}

public class MailingListDispatcherTest {

    @Before
    public void setupService() {
        ConnectionServiceFactory.setService(new FakeService());
    }

    @Test
    public void createDispatcher() throws InterruptedException, ConnectException {
        MailingListDispatcher dispatcher = new MailingListDispatcher();
    }

    @Test
    public void expectMailStatusToBeOk() throws InterruptedException, ConnectException {
        MailingListDispatcher dispatcher = new MailingListDispatcher();
        Assert.assertEquals(dispatcher.status, MailStatus.Ok);
    }

}