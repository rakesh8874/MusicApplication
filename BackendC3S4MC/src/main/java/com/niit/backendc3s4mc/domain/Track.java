package com.niit.backendc3s4mc.domain;

import java.util.List;

public class UserTrackService {
    private int trackId;
    private String trackName;
    private String trackGenre;
    private List<Artist> artistList;

    public UserTrackService() {
    }

    public UserTrackService(int trackId, String trackName, String trackGenre, List<Artist> artistList) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackGenre = trackGenre;
        this.artistList = artistList;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackGenre() {
        return trackGenre;
    }

    public void setTrackGenre(String trackGenre) {
        this.trackGenre = trackGenre;
    }

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    @Override
    public String toString() {
        return "UserTrackService{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackGenre='" + trackGenre + '\'' +
                ", artistList=" + artistList +
                '}';
    }
}
