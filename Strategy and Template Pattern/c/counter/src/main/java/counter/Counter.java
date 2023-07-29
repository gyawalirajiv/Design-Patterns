package counter;

public class Counter extends Subject {
	
	private int count=0;
	private TextFrame textframe ;
	private RectFrame rectframe ;
	private OvalFrame ovalframe ;
	
	public void increment(){
		count++;
		notify_all(count);
	}
	
	public void decrement(){
		count--;
		notify_all(count);
	}

	public void setTextframe(TextFrame textframe) {
		this.textframe = textframe;
	}

	public void setRectframe(RectFrame rectframe) {
		this.rectframe = rectframe;
	}

	public void setOvalframe(OvalFrame ovalframe) {
		this.ovalframe = ovalframe;
	}

}
