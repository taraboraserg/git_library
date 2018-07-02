package ua.mk.taraborkin.controller.permitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.mk.taraborkin.entity.Permitions;
import ua.mk.taraborkin.services.permitions.PermitionsService;

@Controller
@RequestMapping(path= "/permitions")
public class PermitionsController {
    private final PermitionsService permitionsService;
    @Autowired
    public PermitionsController (PermitionsService permitionsService){this.permitionsService = permitionsService;}
    @RequestMapping(path = "/get/(permitionsId)", method = RequestMethod.GET)
    public ResponseEntity getById(@PathVariable Long permitionsId){
        return ResponseEntity.ok("Get Permitions Id");
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity getAllPermitions(){
        return ResponseEntity.ok("Get All Permitions");
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity createPermitions(@RequestBody Permitions permitions) {
        return ResponseEntity.ok("Permitions created");
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody Permitions permitions) {
        return ResponseEntity.ok("Permitions updated");
    }

    @RequestMapping(path = "/delete/(permitionsId)", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(name = "permitionsId") Long permitionsId){
        return ResponseEntity.ok("Permitions deleted");
    }
}
