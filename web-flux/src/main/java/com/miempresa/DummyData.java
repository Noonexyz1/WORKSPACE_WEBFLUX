package com.miempresa;

import com.miempresa.document.Playlist;
import com.miempresa.repository.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;
/*
@Component
public class DummyData implements CommandLineRunner {

    private final PlaylistRepository playlistRepository;

    public DummyData(PlaylistRepository playlistRepository){
        this.playlistRepository = playlistRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        playlistRepository.deleteAll()
                .thenMany(
                        Flux.just("PlayList nombre 1", "PlayList nombre 2", "PlayList nombre 3", "Valor PlayList nombre 4", "PlayList nombre 5")
                                .map(nombre -> new Playlist(UUID.randomUUID().toString(), nombre))
                                .flatMap(playlist -> playlistRepository.save(playlist))
                )
                .subscribe(x -> System.out.println(x));
    }
}
*/
