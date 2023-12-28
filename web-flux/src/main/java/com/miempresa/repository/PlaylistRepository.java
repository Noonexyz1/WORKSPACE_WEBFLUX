package com.miempresa.repository;

import com.miempresa.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
