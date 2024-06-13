package in.subha.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.subha.service.MsgService;

@WebMvcTest(controllers = MsgRestController.class) //this test class will perform unit testing for specified rest controller class
public class MsgRestControllerTest {
	@MockBean
	private MsgService service; //creating and injecting mock object of service class
	
	@Autowired
	private MockMvc mockMvc; //injecting MockMvc object into this test class for http request bcoz the controller method contains http get request
	
	@Test
	public void testMsg() throws Exception {
		
		//defining mock object behaviour
		when(service.getmsg()).thenReturn("Dummy data for msg()..."); //to avoid NullPointerException
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/msg"); //here we are preparing get request
		MvcResult result = mockMvc.perform(request).andReturn(); // perform the request and return response
		MockHttpServletResponse response = result.getResponse(); //get response object
		
		String contentAsString = response.getContentAsString();
		System.out.println(contentAsString); //we are printing the dummy data
		
		int status = response.getStatus(); // from response getting status code
		assertEquals(200,status);		
	}
	
	@Test
	public void testGreetMsg() throws Exception {
		
		when(service.getGreetMsg()).thenReturn("Dummy data for greet()...");
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/greet");
		MvcResult result = mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String contentAsString = response.getContentAsString();
		System.out.println(contentAsString);
		
		int status = response.getStatus();
		assertEquals(200,status);
		
	}

}
