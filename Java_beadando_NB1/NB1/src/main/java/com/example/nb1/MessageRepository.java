package com.beadando.nb1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface MessageRepository extends JpaRepository<Message, Integer> {

}
