package ua.mk.taraborkin.controller.puplisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.mk.taraborkin.controller.puplisher.Request.CreatePublisherRequest;
import ua.mk.taraborkin.entity.Publisher;
import ua.mk.taraborkin.services.publisher.PublisherService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path= "/publisher")
public class PublisherController {
    private final PublisherService publisherService ;
    @Autowired
    public PublisherController(PublisherService publisherService){this.publisherService = publisherService;}
    @RequestMapping(path = "/get/(publisherId)", method = RequestMethod.GET)
    public ResponseEntity getById(@PathVariable Long publisherId){
        return ResponseEntity.ok("Get Publisher Id");
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity getAllPublishers(){
        return ResponseEntity.ok("Get All Publishers");
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity createPublisher(ModelAndView modelAndView, @ModelAttribute(name = "publisher")
                                          CreatePublisherRequest publisher, BindingResult bindingResult,
                                          HttpServletRequest request) {
        Publisher publisher1 = new Publisher();
        publisher1.setName(publisher.getName());
        publisher1.setCity(publisher.getCity());
        publisher1.setYear(publisher.getYear());
        publisherService.create(publisher1);

        return ResponseEntity.ok("Publisher created");
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody Publisher publisher) {
        return ResponseEntity.ok("Publisher updated");
    }

    @RequestMapping(path = "/delete/(publisherId)", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(name = "publisherId") Long publisherId){
        return ResponseEntity.ok("Publisher deleted");
    }
}
