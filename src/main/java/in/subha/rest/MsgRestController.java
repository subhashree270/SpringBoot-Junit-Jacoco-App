package in.subha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.subha.service.MsgService;

@RestController
public class MsgRestController {
	@Autowired
	private MsgService service;
	
	@GetMapping("/msg")
	public String getMessage() {
		System.out.println(service.getClass().getName()); //checking this object come from mock object or not
		String msg = service.getmsg();
		return msg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = service.getGreetMsg();
		return msg;
	}

}
