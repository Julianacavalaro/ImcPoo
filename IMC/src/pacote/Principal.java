package pacote;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente p1 = new Paciente(50,1.66);
		Paciente p2 = new Paciente(60,1.66);
		Paciente p3 = new Paciente(69,1.60);
		
		System.out.println("Seu IMC é " + p1.calculaIMC());
		System.out.println(p1.diagnostico());
		
		System.out.println("Seu IMC é " + p2.calculaIMC());
		System.out.println(p2.diagnostico());
		
		System.out.println("Seu IMC é " + p3.calculaIMC());
		System.out.println(p3.diagnostico());
		   Paciente paciente = new Paciente(45, 1.60); 
		   System.out.println("-------------------");
		   System.out.println(paciente.diagnostico());
		   System.out.println(paciente.calculaIMC());
	}

}
