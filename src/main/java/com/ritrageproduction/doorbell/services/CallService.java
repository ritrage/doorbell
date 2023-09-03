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
		Twilio.init(System.getenv(ACCOUNT_SID), System.getenv(AUTH_TOKEN));
        Call call = Call.creator(
                new PhoneNumber(System.getenv(toPhone)),
                new PhoneNumber(System.getenv(fromPhone)),
                URI.create("http://demo.twilio.com/docs/voice.xml"))
            .create();
        System.out.println(call.getSid());
		Call call1 = Call.creator(
						new PhoneNumber(System.getenv(toPhone1)),
						new PhoneNumber(System.getenv(fromPhone)),
						URI.create("http://demo.twilio.com/docs/voice.xml"))
				.create();
		System.out.println(call1.getSid());
	}

}
