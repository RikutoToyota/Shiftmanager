package javaFW.A.ShiftManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaFW.A.ShiftManager.model.PostModel;
import javaFW.A.ShiftManager.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostModel> getAllPosts() {
        return postRepository.findAll();
    }

    public PostModel getPostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    public PostModel createPost(PostModel post) {
        return postRepository.save(post);
    }

    public PostModel updatePost(Long postId, PostModel updatedPost) {
        PostModel existingPost = postRepository.findById(postId).orElse(null);

        if (existingPost != null) {
            existingPost.setPostName(updatedPost.getPostName());
            existingPost.setHourlyWage(updatedPost.getHourlyWage());
            existingPost.setHourlyWage(updatedPost.getHourlyWage());
            existingPost.setAuthority(updatedPost.getAuthority());

            return postRepository.save(existingPost);
        } else {
            return null;
        }
    }

    public void deletePost(Long postId) {
        postRepository.deleteById(postId);
    }
}
