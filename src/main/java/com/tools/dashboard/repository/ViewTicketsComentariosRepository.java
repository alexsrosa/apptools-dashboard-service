package com.tools.dashboard.repository;

import com.tools.dashboard.domain.ViewTicketsComentarios;
import org.springframework.data.repository.CrudRepository;

public interface ViewTicketsComentariosRepository extends CrudRepository<ViewTicketsComentarios, Integer> {

    ViewTicketsComentarios findByNumeroAndTipoAndDataHora(String numero,
                                                          String tipo,
                                                          String dataHora);
}
