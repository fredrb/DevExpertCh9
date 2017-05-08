package com.sap.devexpert;

import org.junit.Assert;
import org.junit.Test;

import java.net.ConnectException;

import static org.junit.Assert.*;

class FakeService implements Service {
    @Override
    public void connect() throws ConnectException {

    }

    @Override
    public ServiceStatus getStatus() {
        return ServiceStatus.Available;
    }

    @Override
    public void register(MailingListDispatcher mailingListDispatcher, int clientType) {

    }

    @Override
    public void setParam(int clientType, String param) {

    }
}

public class MailingListDispatcherTest {

    @Test
    public void createDispatcher() throws InterruptedException, ConnectException {
        MailingListDispatcher dispatcher = new MailingListDispatcher(new FakeService());
    }

    @Test
    public void expectMailStatusToBeOk() throws InterruptedException, ConnectException {
        MailingListDispatcher dispatcher = new MailingListDispatcher(new FakeService());
        Assert.assertEquals(dispatcher.status, MailStatus.Ok);
    }

}