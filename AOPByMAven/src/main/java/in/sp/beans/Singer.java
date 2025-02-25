package in.sp.beans;

import org.springframework.stereotype.Component;

@Component("singer")
public class Singer {
	
	private String song;

	public Singer() {
		super();
	}

	public Singer(String song) {
		super();
		this.song = song;
	}

	@Override
	public String toString() {
		return "Singer [song=" + song + "]";
	}
	
	public void perform() {
		System.out.println("Singer Singing....");
	}

}
