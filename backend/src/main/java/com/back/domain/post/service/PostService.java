package com.back.domain.post.service;

import com.back.domain.post.entity.Post;
import com.back.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostRepository postRepository;

  public List<Post> findAll() {
    return postRepository.findAll();
  }

  public Long count() {
    return postRepository.count();
  }

  public void write(String title, String content) {
    Post post = Post.builder()
        .title(title)
        .content(content)
        .build();

    postRepository.save(post);
  }
}
