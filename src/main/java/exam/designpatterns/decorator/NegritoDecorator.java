package exam.designpatterns.decorator;

public class NegritoDecorator extends TextoDecorator {

	public NegritoDecorator(TextoDecorator decorator) {
		super(decorator);
	}

	@Override
	public String processar (String text) {
		return "**" + super.processar(text) + "**";
	}
}
