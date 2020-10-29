package spring.reddit.springredditbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.reddit.springredditbackend.model.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
