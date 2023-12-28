package com.miempresa.controller;

import com.miempresa.document.Playlist;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

public interface PlaylistController {
    Flux<Playlist> getAllPlaylist();
    Mono<Playlist> getPlayListById(@PathVariable String id);
    Mono<Playlist> saveNewPlaylist(@RequestBody Playlist playlist);
    Flux<Tuple2<Long, Playlist>> getPlayListByEvents();

}
