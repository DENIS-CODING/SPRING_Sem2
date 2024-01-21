public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ... другие методы

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}