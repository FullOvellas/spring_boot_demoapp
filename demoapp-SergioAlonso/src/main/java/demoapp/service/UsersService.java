package demoapp.service;

import demoapp.model.UserData;
import demoapp.model.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    UserRepository repository;

    public UsersService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserData> getAllUsers() {

        ArrayList<UserData> result = new ArrayList<>();
        repository.findAll().forEach(result::add);

        return result;

    }

}
