package com.alexsandrocs.workshopmongo.services;

import com.alexsandrocs.workshopmongo.domain.Post;
import com.alexsandrocs.workshopmongo.repository.PostRepository;
import com.alexsandrocs.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    public List<Post> findByTitle(String text){

        // findByTitleContainingIgnoreCase ou searchTitle.
        return repo.searchTitle(text);
    }
}