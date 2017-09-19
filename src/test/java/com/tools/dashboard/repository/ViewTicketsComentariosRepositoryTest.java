package com.tools.dashboard.repository;

import com.tools.dashboard.domain.ViewTicketsComentarios;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewTicketsComentariosRepositoryTest {
	
	@Autowired
	private ViewTicketsComentariosRepository repository;
	
	@Test
	public void testfindByIdTicketsComentarios() {
		ViewTicketsComentarios ticketsComentarios  =
				repository.findByNumeroAndTipoAndDataHora("teste","teste","teste");
		System.out.println("#testfindByIdTicketsComentarios: " + ticketsComentarios.toString());
		
		if("teste".equals(ticketsComentarios.getNumero())){
			assertEquals(true, true);
		}else{
			assertEquals(true, false);
		}
	}

}
