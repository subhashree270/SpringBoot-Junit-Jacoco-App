package in.subha.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {
	
	public String getmsg() {
		return "Welcome home";
	}
	
	public String getGreetMsg() {
		return "Good morning";
	}

}
