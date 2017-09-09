package com.tools.dashboard.repositories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tools.dashboard.domain.ViewProblemas;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewProblemasRepositoryTest {
	
	@Autowired
	private ViewProblemasRepository viewProblemasRepository;
	
	@Test
	public void testFetchMatricula() {
		ViewProblemas findByCodigoProblema = viewProblemasRepository.findByCodigoProblema("9959769");
		
		System.out.println("#testFetchMatricula -- Total de registros encontrados: " + findByCodigoProblema.toString());
		
		if("9959769".equals(findByCodigoProblema.getCodigoProblema())){
			assertEquals(true, true);
		}else{
			assertEquals(true, false);
		}
	}

}
