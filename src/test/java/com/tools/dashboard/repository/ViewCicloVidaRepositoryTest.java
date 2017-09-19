package com.tools.dashboard.repository;

import com.tools.dashboard.domain.ViewCicloVida;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewCicloVidaRepositoryTest {

    @Autowired
    private ViewCicloVidaRepository repository;

    @Test
    public void testFindByIdViewCicloVida(){

        ViewCicloVida viewCicloVida =
                repository.findByNumeroDoChamadoAndInicioAndStatusAndGrupo("", "", "", "");

        System.out.println("#testFindByIdViewCicloVida: " + viewCicloVida.toString());

        if("205032".equals(viewCicloVida.getNumeroDoChamado())){
            assertEquals(true, true);
        }else{
            assertEquals(true, false);
        }
    }
}
