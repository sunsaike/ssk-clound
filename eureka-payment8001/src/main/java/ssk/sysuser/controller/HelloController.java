package ssk.sysuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin!";
    }

    @GetMapping("/mapper/hello")
    public String user(){
        return "hello user!";
    }

    @GetMapping("/db/hello")
    public String dba(){
        return "hello dba!";
    }
}
