package ccom.idat.tareaexoneracion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ccom.idat.tareaexoneracion.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

}
