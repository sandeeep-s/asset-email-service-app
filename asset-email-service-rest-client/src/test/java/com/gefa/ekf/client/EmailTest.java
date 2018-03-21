package com.gefa.ekf.client;


import com.gefa.ekf.client.activities.ClientSendEmailActivity;
import com.gefa.ekf.client.domain.Email;
import com.gefa.ekf.client.exceptions.NotFoundException;
import com.gefa.ekf.client.exceptions.ServiceFailureException;
import com.gefa.ekf.domain.TestEmailFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import java.net.URI;
import java.net.URISyntaxException;


public class EmailTest {

    @BeforeClass
    public static void init() throws Exception {
//        MyServer.startContainer();
    }

    @AfterClass
    public static void stop() throws Exception {
  //      MyServer.stopContainer();

    }

	private String getEntryPointURI() {
		return "http://localhost:8083/asset-email-service/email";
	}

    @Test
    public void testCreateAsset() throws URISyntaxException, NotFoundException, ServiceFailureException {
        ClientSendEmailActivity clientSendEmailActivity = new ClientSendEmailActivity();

        TestEmailFactory testEmailFactory = new TestEmailFactory();
        Email email = testEmailFactory.createAsset();

        clientSendEmailActivity.sendEmail(email, new URI(getEntryPointURI()));

    }


}
