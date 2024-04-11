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
	
	@Test
	void pesonormal() {
		Paciente pacientePesoNormal = new Paciente(62, 1.66);
		System.out.println(pacientePesoNormal.calculaIMC());
		assertEquals(pacientePesoNormal.diagnostico(), "Peso normal");
		assertEquals(pacientePesoNormal.calculaIMC(),22.49963710262738);

	};

	@Test
	void sobrePeso() {
		Paciente pacienteSobrePeso = new Paciente(69, 1.66);
		System.out.println(pacienteSobrePeso.calculaIMC());
		assertEquals(pacienteSobrePeso.diagnostico(), "Sobrepeso");
		assertEquals(pacienteSobrePeso.calculaIMC(),25.039918710988534);

	};
	
	@Test
	void obesidadeGrauUm() {
		Paciente pacienteobesidadeGrauUm = new Paciente(85, 1.66);
		System.out.println(pacienteobesidadeGrauUm.calculaIMC());
		assertEquals(pacienteobesidadeGrauUm.diagnostico(), "Obesidade grau I");
		assertEquals(pacienteobesidadeGrauUm.calculaIMC(),30.84627667295689);
	};
	
	@Test
	void obesidadeGrauDois() {
		Paciente pacienteobesidadeGrauDois = new Paciente(100, 1.66);
		System.out.println(pacienteobesidadeGrauDois.calculaIMC());
		assertEquals(pacienteobesidadeGrauDois.diagnostico(), "Obesidade grau II");
		assertEquals(pacienteobesidadeGrauDois.calculaIMC(),36.289737262302225);
	};
	
	@Test
	void obesidadeGrauTres() {
		Paciente pacienteobesidadeGrauTres = new Paciente(112, 1.66);
		System.out.println(pacienteobesidadeGrauTres.calculaIMC());
		assertEquals(pacienteobesidadeGrauTres.diagnostico(), "Obesidade grau III (obesidade mórbida)");
		assertEquals(pacienteobesidadeGrauTres.calculaIMC(),40.64450573377849);

	};
}
