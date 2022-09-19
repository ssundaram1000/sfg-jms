package guru.springframework.sfgjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

// Spring picks this up as a config class
// and scan it for methods that have been annotated with @Bean annotation
// It will now inject a TaskExecutor bean into SpringContext
// Spring will use this to execute tasks

@EnableScheduling
@EnableAsync
@Configuration
public class TaskConfig {

    @Bean
    TaskExecutor taskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
}
