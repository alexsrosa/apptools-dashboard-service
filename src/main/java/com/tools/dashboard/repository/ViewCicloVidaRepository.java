package com.tools.dashboard.repository;

import com.tools.dashboard.domain.ViewCicloVida;
import org.springframework.data.repository.CrudRepository;

public interface ViewCicloVidaRepository extends CrudRepository<ViewCicloVida, Integer> {

    ViewCicloVida findByNumeroDoChamadoAndInicioAndStatusAndGrupo(String numeroDoChamado,
                                                                        String inicio,
                                                                        String status,
                                                                        String grupo);
}
