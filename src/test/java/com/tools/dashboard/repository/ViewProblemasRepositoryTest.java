package com.tools.dashboard.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tools.dashboard.domain.ViewProblemas;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewProblemasRepositoryTest {
	
	@Autowired
	private ViewProblemasRepository repository;
	
	@Test
	public void testfindByIdProblema() {
		ViewProblemas problema = repository.findById(9959769).get();
		System.out.println("#testfindByIdProblema: " + problema.toString());
		
		if("9959769".equals(problema.getCodigoProblema())){
			assertEquals(true, true);
		}else{
			assertEquals(true, false);
		}
	}

}
