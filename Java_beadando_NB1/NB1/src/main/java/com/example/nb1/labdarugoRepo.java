package com.beadando.nb1;


import org.springframework.data.repository.CrudRepository;
public interface labdarugoRepo extends CrudRepository<labdarugo, Integer>{
    labdarugo findByNév(String név);

}

