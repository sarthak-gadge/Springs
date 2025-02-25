package in.sp.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class AudienceAspect {
	
	@After("execution(public void perform())")
	public void end() {
		System.out.println("Clap Clap!!!");
		
	}

}
