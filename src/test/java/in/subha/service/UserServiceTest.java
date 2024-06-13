package in.subha.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import in.subha.dao.UserDao;

@SpringBootTest
@ExtendWith(value = {MockitoExtension.class}) //this will help to inject mock object into target class
public class UserServiceTest {
	
	@MockBean
	private UserDao dao; //creating target class dependent mock object
	
	@InjectMocks
	private UserService service; //inject mock object into target class
	
	@Test
	public void testName() {
		//defining the behaviour of mock object
		when(dao.findNameById(101)).thenReturn("Yipee");
		
		String name = service.getName(101);
		assertNotNull(name);
	}	

}
