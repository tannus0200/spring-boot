package tannusit.spring_boot_sgate.service;

import org.springframework.stereotype.Service;
import tannusit.spring_boot_sgate.repository.PostRepository;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }
    public String getPost() {
        String result = postRepository.getPost();
    return result;
    }
}
