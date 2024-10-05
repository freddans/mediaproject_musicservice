package com.freddan.mediaproject_musicservice.services;

import com.freddan.mediaproject_musicservice.dto.MusicDTO;
import com.freddan.mediaproject_musicservice.entities.Album;
import com.freddan.mediaproject_musicservice.entities.Artist;
import com.freddan.mediaproject_musicservice.entities.Genre;
import com.freddan.mediaproject_musicservice.entities.Music;

import java.util.List;

public interface MusicServiceInterface {

    List<Music> findAllMusic();
    List<Music> findMusicByArtist(String artistName);
    List<Music> findMusicByAlbum(String albumName);
    List<Music> findMusicByGenre(String genreName);
    Music findMusicByUrl(String url);
    Music findMusicById(long id);
    Music createMusic(MusicDTO musicDTO);
    List<Genre> getAllGenres(MusicDTO musicDTO);
    List<Album> getAllAlbums(MusicDTO musicDTO);
    List<Artist> getAllArtists(MusicDTO musicDTO);
    Music updateMusic(long id, MusicDTO newMusicInfo);
    String deleteMusic(long id);
    String playMusic(String url);
    String likeMusic(String url);
    String disLikeMusic(String url);
    Boolean checkIfMusicExistByUrl(String url);
}
