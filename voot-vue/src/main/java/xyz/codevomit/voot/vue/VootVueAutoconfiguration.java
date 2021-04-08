package xyz.codevomit.voot.vue;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.codevomit.voot.vue.serve.VueAppDevelopmentController;

@Configuration
@ComponentScan(basePackageClasses = VueAppDevelopmentController.class)
public class VootVueAutoconfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/voot-vue/**")
        .addResourceLocations("classpath:/static/");
    }
}
