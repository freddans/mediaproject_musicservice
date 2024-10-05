package com.freddan.mediaproject_musicservice.repositories;

import com.freddan.mediaproject_musicservice.entities.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {
    Music findMusicByUrl(String url);
}
