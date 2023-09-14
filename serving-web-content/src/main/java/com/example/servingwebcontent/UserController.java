package com.example.servingwebcontent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    private String hello() {
        return "Hello World";
    }

    @RequestMapping("/user/{id}")
    private ModelAndView getUser(@PathVariable Integer id, Model model)   {
        String uri = "https://jsonplaceholder.typicode.com/todos/1";
        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(uri, User.class);
        uUserid Userid = user.getuserId();
        System.out.println("User: " + user);
        System.out.println("Userid: " + user.getuserId());
        System.out.println("id: " + user.getId());
        System.out.println("title: " + user.gettitle());
        System.out.println("Completed: " + user.getcompleted());

        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("user", user);
        modelAndView.addObject("Userid", Uerid);
        modelAndView.addObject("id", id);
        modelAndView.addObject("title", title);
        return "User detail page.";
    }
}