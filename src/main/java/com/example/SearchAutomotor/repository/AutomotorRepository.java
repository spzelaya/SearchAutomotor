package com.example.SearchAutomotor.repository;

import com.example.SearchAutomotor.Model.Automotor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutomotorRepository extends JpaRepository<Automotor,Long> {

    @Query(value = "select * from automotores s where s.marca like %:marca% and s.descripcion like %:descripcion% and s.tipo like %:tipo%", nativeQuery = true)
    List<Automotor> findByMarcaDescripcionAndTipo(@Param("marca") String marca, @Param("descripcion") String descripcion,@Param("tipo") String tipo);
}
