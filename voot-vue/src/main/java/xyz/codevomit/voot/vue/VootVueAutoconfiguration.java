package xyz.codevomit.voot.vue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import xyz.codevomit.voot.vue.serve.VueAppDevelopmentController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
@ComponentScan(basePackageClasses = VueAppDevelopmentController.class)
public class VootVueAutoconfiguration {

}
