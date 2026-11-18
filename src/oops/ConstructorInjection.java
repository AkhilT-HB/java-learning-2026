package oops;

public class ConstructorInjection {
}


class UserRepository{

    void save(){
        System.out.println("User saved");
    }
}

class UserService{

    UserRepository repo;

    UserService(UserRepository userRepository){
        this.repo = userRepository;
    }

    void saveUser(){
        repo.save();
    }

}

