package com.tools.dashboard.repositories;

import org.springframework.data.repository.Repository;

import com.tools.dashboard.domain.ViewProblemas;

public interface ViewProblemasRepository extends Repository<ViewProblemas, Integer>{
	
	ViewProblemas findByCodigoProblema(String codigoProblemas);
	
}
