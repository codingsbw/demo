package com.example.demo.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//	http://cron.qqe2.com/     cron表达式生成地址
	// 定义每过3秒执行任务
//    @Scheduled(fixedRate = 3000)
//	@Scheduled(cron = "4-40 * * * * ?")
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
