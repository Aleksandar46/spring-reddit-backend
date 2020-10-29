package spring.reddit.springredditbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.reddit.springredditbackend.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
