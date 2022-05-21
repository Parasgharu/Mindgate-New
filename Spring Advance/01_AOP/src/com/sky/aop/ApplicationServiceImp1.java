package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImp1 implements ApplicationService {

	@Override
	public void processApplication() {
		System.out.println("processApplicationForm");
	}
	@Auditable(value="check")
	@Override
	public String processApplicationWithAudit() {
		System.out.println("Process ApplicationForm in Service");
		return "sucess";
	}

}
