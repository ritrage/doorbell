package com.ritrageproduction.doorbell.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

import java.net.URI;

import static com.ritrageproduction.doorbell.util.Constants.*;

@Service
public class CallService {

	public void callResident() {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Call call = Call.creator(
                new PhoneNumber(toPhone),
                new PhoneNumber(fromPhone),
                URI.create("http://demo.twilio.com/docs/voice.xml"))
            .create();
//		Call call1 = Call.creator(
//						new PhoneNumber(toPhone1),
//						new PhoneNumber(fromPhone),
//						URI.create("http://demo.twilio.com/docs/voice.xml"))
//				.create();
        System.out.println(call.getSid());
//		System.out.println(call1.getSid());
	}

}
