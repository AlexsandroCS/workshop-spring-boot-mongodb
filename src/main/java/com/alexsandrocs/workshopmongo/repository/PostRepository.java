package com.alexsandrocs.workshopmongo.repository;

import com.alexsandrocs.workshopmongo.domain.Post;
import com.alexsandrocs.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
