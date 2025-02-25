package in.sp.beans;

import org.springframework.stereotype.Component;

@Component("magician")
public class Magician {
	
	private String magicWord;

	public Magician() {
		super();
	}

	public Magician(String magicWord) {
		super();
		this.magicWord = magicWord;
	}

	@Override
	public String toString() {
		return "Magician [magicWord=" + magicWord + "]";
	}
	
	public void perform() {
		System.out.println("Magician uttering magicwords");
	}

}
