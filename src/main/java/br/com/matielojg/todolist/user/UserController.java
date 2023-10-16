package br.com.matielojg.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    /**
     * String (texto)
     * Integer (int) num inteiros
     * Double(double) Números 0.000
     * Float (float)
     * char (A C)
     * Date (data)
     * void 
     */

    @PostMapping("/")    
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getUsername());
    }

}
