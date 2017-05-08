package com.sap.devexpert;

import org.junit.Assert;
import org.junit.Test;

import java.net.ConnectException;

import static org.junit.Assert.*;

class FakeService extends MailService {
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

class TestDispatcher extends MailingListDispatcher {

    public TestDispatcher() throws ConnectException, InterruptedException {
        super();
    }

    @Override
    protected MailService makeService() {
        return new FakeService();
    }
}

public class MailingListDispatcherTest {

    @Test
    public void createDispatcher() throws InterruptedException, ConnectException {
        MailingListDispatcher dispatcher = new TestDispatcher();
    }

    @Test
    public void expectMailStatusToBeOk() throws InterruptedException, ConnectException {
        MailingListDispatcher dispatcher = new TestDispatcher();
        Assert.assertEquals(dispatcher.status, MailStatus.Ok);
    }

}