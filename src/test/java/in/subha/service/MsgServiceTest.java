package in.subha.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //used for service class
public class MsgServiceTest {
	
	@Autowired
	private MsgService service; //inject service class to this test class here we don't have any dependent obj so no need to create mock object for that
	
	@Test
	public void testMsg() {
		String msg = service.getmsg();
		assertNotNull(msg); //check msg is coming or not
	}
	@Test
	public void testGreetMsg() {
		String greetMsg = service.getGreetMsg();
		assertNotNull(greetMsg);
	}

}
