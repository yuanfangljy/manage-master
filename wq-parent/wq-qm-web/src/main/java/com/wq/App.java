package com.wq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @项目名称：
 * @类名称：
 * @类描述：
 * @创建人：liujiayi
 * @创建时间：2018/9/20 8:54
 * @修改时间：2018/9/20 8:54
 * @version：1.0
 */
@Configuration
//@MapperScan(basePackages = {"com.wq.gun.mapper"})
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(App.class);
        // 禁用devTools热部署
        //System.setProperty("spring.devtools.restart.enabled", "false");
        // 禁用命令行更改application.properties属性
        sa.setAddCommandLineProperties(false);
        sa.run(args);
    }
}
