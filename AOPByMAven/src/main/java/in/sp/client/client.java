package in.sp.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Juggler;
import in.sp.beans.Magician;
import in.sp.beans.Singer;
import in.sp.resources.MagicConfigFile;

public class client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MagicConfigFile.class);
		Juggler jug = context.getBean(Juggler.class);
		Magician mag = context.getBean(Magician.class);
		Singer sing = context.getBean(Singer.class);
		jug.perform();
		mag.perform();
		sing.perform();
	}

}
