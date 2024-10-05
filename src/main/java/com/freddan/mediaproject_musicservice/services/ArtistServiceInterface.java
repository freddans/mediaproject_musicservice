package com.freddan.mediaproject_musicservice.services;

import com.freddan.mediaproject_musicservice.entities.Artist;

import java.util.List;

public interface ArtistServiceInterface {
    List<Artist> getAllArtists();
    Artist getArtistByName(String name);
    boolean artistExist(String name);
    Artist createArtist(Artist artist);
}
