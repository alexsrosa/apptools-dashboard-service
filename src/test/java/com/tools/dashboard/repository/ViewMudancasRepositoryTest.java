package com.tools.dashboard.repository;

import com.tools.dashboard.domain.ViewMudancas;
import com.tools.dashboard.domain.ViewProblemas;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewMudancasRepositoryTest {
	
	@Autowired
	private ViewMudancasRepository repository;
	
	@Test
	public void testfindByIdMudanca() {
		ViewMudancas mudanca = repository.findById(189889).get();
		System.out.println("#testfindByIdMudanca - " + mudanca.toString());
		
		if("189889".equals(mudanca.getRdm())){
			assertEquals(true, true);
		}else{
			assertEquals(true, false);
		}
	}

}
