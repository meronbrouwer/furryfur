package nl.github.meron.ontheflyjee.services;

import nl.github.meron.ontheflyjee.resources.dto.PlaylistsDTO;

public class PlaylistsService {

    public PlaylistsDTO getAllPlayLists() {
        var playlistsDTO = new PlaylistsDTO();
        playlistsDTO.setName("Death metal");
        playlistsDTO.setLength(666);

        return playlistsDTO;
    }

    public void addPlaylist() {
        throw new FurkanIsFurryException();
    }
}
