package com.example.demo;

import com.soundcloud.prometheus.hystrix.HystrixPrometheusMetricsPublisher;
import io.micrometer.core.instrument.binder.hystrix.HystrixMetricsBinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCircuitBreaker
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		HystrixPrometheusMetricsPublisher.register();
	}

	@Bean
	HystrixMetricsBinder hystrixMetrics(){
		return new HystrixMetricsBinder();
	}

}

