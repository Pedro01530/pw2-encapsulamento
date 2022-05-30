
public class TestaPneu {
	     public static void main(String[] args) {
			Bomba b1  = new Bomba();
			b1.setPressaoLida(18);
			b1.setPressaoDesejada(30);
			
			System.out.println(b1.obterResultado());
}
}