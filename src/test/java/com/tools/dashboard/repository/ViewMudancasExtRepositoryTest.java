package com.tools.dashboard.repository;

import com.tools.dashboard.domain.ViewMudancasExt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewMudancasExtRepositoryTest {
	
	@Autowired
	private ViewMudancasExtRepository repository;
	
	@Test
	public void testfindByIdMudancasExt() {
		ViewMudancasExt mudancasExt = repository.findById(205032).get();
		System.out.println("#testfindByIdMudancasExt: " + mudancasExt.toString());
		
		if("205032".equals(mudancasExt.getNum_rdm())){
			assertEquals(true, true);
		}else{
			assertEquals(true, false);
		}
	}

}
