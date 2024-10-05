package com.freddan.mediaproject_musicservice.repositories;

import com.freddan.mediaproject_musicservice.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findByNameIgnoreCase(String name);
    boolean existsByNameIgnoreCase(String name);
}