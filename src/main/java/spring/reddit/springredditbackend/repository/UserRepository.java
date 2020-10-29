package spring.reddit.springredditbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.reddit.springredditbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
