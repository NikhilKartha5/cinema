package com.fullstack.backend.repository;

import com.fullstack.backend.model.MovieTheater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieTheaterRepository extends JpaRepository<MovieTheater, Long> {
    Optional<MovieTheater> findById(Long id);
}
