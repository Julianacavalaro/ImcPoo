package pacote;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class Paciente_teste {

	@Test
	void baixopesoMuitoGrave() {
		Paciente pacienteBaixopesoMuitoGrave = new Paciente(40, 1.66);
		System.out.println(pacienteBaixopesoMuitoGrave.calculaIMC());
		assertEquals(pacienteBaixopesoMuitoGrave.calculaIMC(), 14.51589490492089);
		assertEquals(pacienteBaixopesoMuitoGrave.diagnostico(), "Baixo peso muito grave");
	};
	
	@Test
	void baixopesoGrave() {
		Paciente pacienteBaixopesoGrave = new Paciente(46.7, 1.66);
		System.out.println(pacienteBaixopesoGrave.calculaIMC());
		assertEquals(pacienteBaixopesoGrave.calculaIMC(),16.94730730149514);
		assertEquals(pacienteBaixopesoGrave.diagnostico(), "Baixo peso grave");
	};
	
	@Test
	void baixopeso() {
		Paciente pacienteBaixopeso = new Paciente(48, 1.66);
		System.out.println(pacienteBaixopeso.calculaIMC());
		assertEquals(pacienteBaixopeso.calculaIMC(),17.419073885905068);
		assertEquals(pacienteBaixopeso.diagnostico(), "Baixo peso");
	};

}
