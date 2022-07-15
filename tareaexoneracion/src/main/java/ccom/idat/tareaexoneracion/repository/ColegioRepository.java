package ccom.idat.tareaexoneracion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ccom.idat.tareaexoneracion.model.Colegio;

@Repository
public interface ColegioRepository extends JpaRepository<Colegio, Integer> {

}
