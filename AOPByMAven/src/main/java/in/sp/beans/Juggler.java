package in.sp.beans;

import org.springframework.stereotype.Component;

@Component("juggler")
public class Juggler {

	private int noBeanBag;

	public Juggler() {
		super();
	}

	public Juggler(int noBeanBag) {
		super();
		this.noBeanBag = noBeanBag;
	}

	@Override
	public String toString() {
		return "Juggler [noBeanBag=" + noBeanBag + "]";
	}

	public void perform() {
		System.out.println("Jugger juggling....");
	}

}
