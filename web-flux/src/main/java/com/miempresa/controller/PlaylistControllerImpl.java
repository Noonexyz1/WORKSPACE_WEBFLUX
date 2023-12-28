package com.miempresa.controller;

import com.miempresa.document.Playlist;
import com.miempresa.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PlaylistControllerImpl implements PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @Override
    @GetMapping(value = "/playlist")
    public Flux<Playlist> getAllPlaylist() {
        return playlistService.findAll();
    }

    @Override
    @GetMapping(value = "/playlist/{id}")
    public Mono<Playlist> getPlayListById(@PathVariable String id) {
        return playlistService.findById(id);
    }

    @Override
    @PostMapping(value = "/playlist")
    public Mono<Playlist> saveNewPlaylist(@RequestBody Playlist playlist) {
        return playlistService.save(playlist);
    }
}
