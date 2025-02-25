package in.sp.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LightAspect {
	
	@Before("execution(public void perform())")
	public void begin() {
		System.out.println("--------------Lights On-----------------");
	}
	
	@After("execution(public void perform())")
	public void end() {
		System.out.println("--------------Lights OFF-----------------");
	}

}
