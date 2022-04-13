//package com.employee.onboarding.engine.cache;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CachingConfigurerSupport;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
//import org.springframework.cache.interceptor.CacheResolver;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableCaching
//public class CacheConfig extends CachingConfigurerSupport {
//	
//	@Autowired
//	private CacheManager cacheManager;
//	
//	@Bean
//	public ConcurrentMapCacheManager ehOnbConfigCacheManager() {
//		return new ConcurrentMapCacheManager("EMPLOYEE");
//		
//	}
//	
////	@Bean
////	public CacheResolver cacheResolver() {
////		return new MultipleCacheResolver(ehOnbConfigCacheManager(), cacheManager);
////	}
//	
//
//}
