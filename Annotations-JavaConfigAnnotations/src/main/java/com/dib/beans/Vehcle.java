package com.dib.beans;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;

@Named("vehcle") //Alternate to @Component makes class as Spring beans
@Lazy //To enable lazy-init on singleton scope beans
@PropertySource("com/dib/commons/info.properties")
public class Vehcle {
	@Value("${vehcle.type}")
	private String type;
	
//	@Autowired [Spring Supplied]
//	@Inject //Alternate to @Autowired [JEE Supplied]
	@Named("dEngine") //Works like @Primary to solve ambiguity errors
	@Resource  //Alternate to @Autowired [JSE JDK Supplied]
	private Engine engg;

	public void journey(String startPlace, String endPlace) {
		System.out.println("Journey Started From "+startPlace);
		engg.start();
		System.out.println("Journey Going on...");
		engg.stop();
		System.out.println("Journey Stopped At "+endPlace);
	}
}
