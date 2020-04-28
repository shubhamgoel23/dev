package io.github.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.security.models.Userkl;

public interface UserRepository extends JpaRepository<Userkl, Integer>{
	
	Optional<Userkl> findByUserName(String username);

}
