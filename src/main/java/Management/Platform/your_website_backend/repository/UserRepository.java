package Management.Platform.your_website_backend.repository;

import Management.Platform.your_website_backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}