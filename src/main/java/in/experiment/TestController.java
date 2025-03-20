package in.experiment;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping("/")
    public String printHelloWorld(ModelMap modelMap){
        System.out.println("@@@--->Entered--->");
        // add attribute to load modelMap
//        modelMap.addAttribute("message",
//                "Hello World and Welcome to Spring MVC!");

        // return the name of the file to be loaded "hello_world.jsp"
        return "home";
    }

}
