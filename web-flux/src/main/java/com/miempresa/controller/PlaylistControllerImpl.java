package com.miempresa.controller;

import com.miempresa.document.Playlist;
import com.miempresa.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;

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

    @Override
    @GetMapping(value = "/playlist/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tuple2<Long, Playlist>> getPlayListByEvents() {
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));
        Flux<Playlist> events = playlistService.findAll();
        System.out.println("Padamos por aqui los eventos");
        return Flux.zip(interval, events);
    }
}
