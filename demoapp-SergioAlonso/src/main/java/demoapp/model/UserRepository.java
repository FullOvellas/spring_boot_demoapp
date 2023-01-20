package demoapp.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserData, Long> {

    UserData findById(long id);
    List<UserData> findByEdad(int age);

}
