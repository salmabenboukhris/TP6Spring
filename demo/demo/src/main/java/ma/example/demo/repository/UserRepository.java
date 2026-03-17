package ma.example.demo.repository;

import ma.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//interface
@Repository
public interface UserRepository extends CrudRepository<User, Long> {}