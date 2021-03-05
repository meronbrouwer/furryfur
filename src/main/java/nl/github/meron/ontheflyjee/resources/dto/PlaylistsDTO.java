package nl.github.meron.ontheflyjee.resources.dto;

import java.util.List;

public class PlaylistsDTO {

    private String name;
    private int length;
    private List<PlaylistDTO> playlists;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<PlaylistDTO> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<PlaylistDTO> playlists) {
        this.playlists = playlists;
    }
}
