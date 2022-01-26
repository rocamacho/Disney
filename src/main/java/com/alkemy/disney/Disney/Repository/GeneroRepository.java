package com.alkemy.disney.Disney.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alkemy.disney.Disney.Entity.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
		

}
