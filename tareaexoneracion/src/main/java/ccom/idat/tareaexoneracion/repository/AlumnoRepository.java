package ccom.idat.tareaexoneracion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ccom.idat.tareaexoneracion.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
