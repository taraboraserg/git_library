package ua.mk.taraborkin.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.mk.taraborkin.controller.user.Requests.CreateUserRequest;
import ua.mk.taraborkin.entity.User;
import ua.mk.taraborkin.services.user.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path= "/user")
public class UserController {

private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/get/(userId)", method = RequestMethod.GET)
    public ResponseEntity getById(@PathVariable Long userId){
        return ResponseEntity.ok("Get Users Id");
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity getAllUsers(){
        return ResponseEntity.ok("Get All Users");
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity createUser(ModelAndView modelAndView, @ModelAttribute (name = "user") CreateUserRequest user,
                                     BindingResult bindingResult,HttpServletRequest request) {
        User user1 = new User();
        user1.setFirst_Name(user.getFirst_name());
        user1.setLast_Name(user.getLast_name());
        user1.setE_Mail(user.getE_mail());
        user1.setPassword(Long.valueOf(user.getPassword()));
        userService.create(user1);

        return ResponseEntity.ok("User created");
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody User user) {
        return ResponseEntity.ok("User updated");
    }

    @RequestMapping(path = "/delete/(userId)", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(name = "userId") Long userId){
        return ResponseEntity.ok("User deleted");
    }

}
