package com.miguelbarrios.spotifyapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelbarrios.spotifyapp.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
