package ua.mk.taraborkin.controller.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.mk.taraborkin.entity.Role;
import ua.mk.taraborkin.services.role.RoleService;

@Controller
@RequestMapping(path= "/role")
public class RoleController {
private final RoleService roleService;
@Autowired
public RoleController(RoleService roleService){this.roleService = roleService;}
    @RequestMapping(path = "/get/(roleId)", method = RequestMethod.GET)
    public ResponseEntity getById(@PathVariable Long roleId){
        return ResponseEntity.ok("Get Roles Id");
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity getAllRoles(){
        return ResponseEntity.ok("Get All Roles");
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity createRole(@RequestBody Role role) {
        return ResponseEntity.ok("Role created");
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody Role role) {
        return ResponseEntity.ok("Role updated");
    }

    @RequestMapping(path = "/delete/(roleId)", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(name = "roleId") Long roleId){
        return ResponseEntity.ok("Role deleted");
    }

}
