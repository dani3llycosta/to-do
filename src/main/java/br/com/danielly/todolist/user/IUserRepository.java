package br.com.danielly.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

//find by username
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
   UserModel findByUsername(String username);

}
