package x12323.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdsController {

    @GetMapping("pds/list")
    public String pds() {
        return "pds/list";
    }
}
