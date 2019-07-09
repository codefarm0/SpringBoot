package com.gl.taskScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class TaskSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskSchedulerApplication.class, args);
	}

	@Scheduled(fixedDelay = 1000)
	public void delayTask() throws InterruptedException {
        System.out.println(new Date().getSeconds());
        Thread.sleep(2000);
    }


	@Scheduled(fixedRate = 1000)
	public void fixedRateTask() throws InterruptedException {
		System.out.println(new Date().getSeconds());
		Thread.sleep(2000);
	}

	@Scheduled(fixedDelay = 1000, initialDelay = 1000)
	public void delayTaskWithInitDelay() throws InterruptedException {
		System.out.println(new Date().getSeconds());
		Thread.sleep(2000);
	}


	@Scheduled(fixedRate = 1000, initialDelay = 1000)
	public void fixedRateTaskInitDelay() throws InterruptedException {
		System.out.println(new Date().getSeconds());
		Thread.sleep(2000);
	}


	@Scheduled(fixedDelayString = "${fixed.delay.millis}")
	public void delayStringTask() throws InterruptedException {
		System.out.println(new Date().getSeconds());
		Thread.sleep(2000);
	}

	@Scheduled(fixedDelayString = "${fixed.rate.millis}")
	public void dfixedRateStringTask() throws InterruptedException {
		System.out.println(new Date().getSeconds());
		Thread.sleep(2000);
	}


	@Scheduled(fixedDelayString = "${fixed.delay.millis}", initialDelayString = "${init.delay.millis}")
	public void delayStringTaskWithInitDelay() throws InterruptedException {
		System.out.println(new Date().getSeconds());
		Thread.sleep(2000);
	}

	@Scheduled(fixedDelayString = "${fixed.rate.millis}", initialDelayString = "${init.delay.millis}")
	public void dfixedRateStringTaskWithInitDelay() throws InterruptedException {
		System.out.println(new Date().getSeconds());
		Thread.sleep(2000);
	}
}
