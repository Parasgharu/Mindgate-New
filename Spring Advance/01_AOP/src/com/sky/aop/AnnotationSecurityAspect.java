package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationSecurityAspect {
//	@Before("execution(* com.sky.aop.ApplicationService.*(..))")
//	public void verifyApplication() {
//		System.out.println("Ina anno before call");
//	}
//	
	@After("execution(* com.sky.aop.ApplicationService.*(..))")
	public void processResults() {
		System.out.println("processResults");
	}
	
	@Before("@annotation(auditable)")  
	public void doAccessCheck4(Auditable auditable) {
		System.out.println("do access check 4" + " "+ auditable.value());
	}
	
}
