package nl.github.meron.ontheflyjee.resources;

import nl.github.meron.ontheflyjee.resources.dto.PlaylistsDTO;
import nl.github.meron.ontheflyjee.services.PlaylistsService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/playlists")
public class PlayListResource {

    private PlaylistsService playlistsService;

    @Inject
    public void setPlaylistsService(PlaylistsService playlistsService) {
        this.playlistsService = playlistsService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPlayLists() {
        var playlistsDTO = playlistsService.getAllPlayLists();

        return Response.status(200).entity(playlistsDTO).build();
    }

    @GET
    @Path("furkan")
    public Response furkan() {
        playlistsService.addPlaylist();

        return Response.ok().build();
    }
}
