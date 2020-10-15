package icu.bitchigo.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;


@Configuration
public class AsyncConfig implements AsyncConfigurer {

    public Executor getAsyncExecutor() {
        //定义线程池
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        //设置核心线程数
        threadPoolTaskExecutor.setCorePoolSize(10);
        //设置线程池最大线程数
        threadPoolTaskExecutor.setMaxPoolSize(30);
        //设置线程队列最大线程数
        threadPoolTaskExecutor.setQueueCapacity(2000);
        //初始化线程池
        threadPoolTaskExecutor.initialize();

        return threadPoolTaskExecutor;
    }
}


