package nl.github.meron.ontheflyjee.resources;


import nl.github.meron.ontheflyjee.resources.dto.PlaylistsDTO;
import nl.github.meron.ontheflyjee.services.PlaylistsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PlayListResourceTest {

    @Test
    void getAllPlayListsReturns200() {
        // Arrange
        var plDTO = new PlaylistsDTO();

        var sut = new PlayListResource();
        var service = mock(PlaylistsService.class);
        when(service.getAllPlayLists()).thenReturn(plDTO);

        sut.setPlaylistsService(service);

        // Act
        Response response = sut.getAllPlayLists();

        // Assert
        assertEquals(200, response.getStatus());
    }

    @Test
    void getAllPlayListsReturnsTheDTOFromTheService() {
        // Arrange
        var plDTO = new PlaylistsDTO();

        var sut = new PlayListResource();
        var service = mock(PlaylistsService.class);
        when(service.getAllPlayLists()).thenReturn(plDTO);

        sut.setPlaylistsService(service);

        // Act
        Response response = sut.getAllPlayLists();

        // Assert
        assertEquals(plDTO, response.getEntity());
    }
}
