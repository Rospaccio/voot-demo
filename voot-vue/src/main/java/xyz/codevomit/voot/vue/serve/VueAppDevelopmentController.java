package xyz.codevomit.voot.vue.serve;

import org.apache.commons.io.IOUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@RestController
public class VueAppDevelopmentController {

//    @RequestMapping("/voot-vue/**")
//    public void redirectToMain(HttpServletResponse response) {
//        try {
//            response.sendRedirect("/voot-vue");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    @RequestMapping(path = {"/voot-vue"})
    public ResponseEntity<String> home() {
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("static/main.html");
        try {
            String pageContent = IOUtils.toString(resourceAsStream, StandardCharsets.UTF_8);
            return ResponseEntity.ok(pageContent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
