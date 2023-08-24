package cl.bci.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.bci.api.model.Users;


public interface UsersRepository extends JpaRepository<Users, UUID>{

}
