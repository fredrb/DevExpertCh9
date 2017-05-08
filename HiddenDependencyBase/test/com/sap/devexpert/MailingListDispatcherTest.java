package com.sap.devexpert;

import org.junit.Assert;
import org.junit.Test;

import java.net.ConnectException;

import static org.junit.Assert.*;

public class MailingListDispatcherTest {

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