package xyz.codevomit.voot.vue.serve;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class VueAppDevelopmentController {

    @RequestMapping(path = {"/voot-vue/**"})
    public RedirectView home(){

        return new RedirectView("/voot-vue/main.html");
    }

    @RequestMapping("/voot-vue/main.html")
    public String index(){

        return "/main.html";
    }
}
