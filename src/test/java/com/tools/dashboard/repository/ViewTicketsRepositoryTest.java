package com.tools.dashboard.repository;

import com.tools.dashboard.domain.ViewTickets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewTicketsRepositoryTest {
	
	@Autowired
	private ViewTicketsRepository repository;
	
	@Test
	public void testfindByIdTickets() {
		ViewTickets tickets = repository.findById(15239268).get();
		System.out.println("#testfindByIdTickets: " + tickets.toString());
		
		if("15239268".equals(tickets.getIncidente())){
			assertEquals(true, true);
		}else{
			assertEquals(true, false);
		}
	}

}
