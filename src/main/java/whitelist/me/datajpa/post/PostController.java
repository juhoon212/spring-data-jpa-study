package whitelist.me.datajpa.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.PagedModel;

@RestController
public class PostController {

    @Autowired
    private PostRepository2 postRepository;

    @GetMapping("/posts")
    public PagedModel<EntityModel<Post2>> getPosts(Pageable pageable, PagedResourcesAssembler<Post2> assembler) {
        return assembler.toModel(postRepository.findAll(pageable));
    }
}
