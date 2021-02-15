package x12323.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

    @GetMapping("board/list")
    public String gallery() {
        return "board/list";
    }
}
