package alura.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import alura.api.model.User;
import alura.api.repository.UserRepository;

@Service
@Transactional
public class UserService 
{
    @Autowired
    private UserRepository userRepository;
    public List<User> listAllUser() 
    {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
