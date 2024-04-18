package pacote;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class PacienteTeste {

	@Test
	void baixopesoMuitoGrave() {
		Paciente pacienteBaixopesoMuitoGrave = new Paciente(40, 1.66);
		System.out.println(pacienteBaixopesoMuitoGrave.calculaIMC());
		assertEquals(pacienteBaixopesoMuitoGrave.calculaIMC(), 14.51, 0.01);
		assertEquals(pacienteBaixopesoMuitoGrave.diagnostico(), "Baixo peso muito grave");
	};
	
	@Test
	void baixopesoGrave() {
		Paciente pacienteBaixopesoGrave = new Paciente(46.7, 1.66);
		System.out.println(pacienteBaixopesoGrave.calculaIMC());
		assertEquals(pacienteBaixopesoGrave.calculaIMC(),16.94, 0.01);
		assertEquals(pacienteBaixopesoGrave.diagnostico(), "Baixo peso grave");
	};
	
	@Test
	void baixopeso() {
		Paciente pacienteBaixopeso = new Paciente(48, 1.66);
		System.out.println(pacienteBaixopeso.calculaIMC());
		assertEquals(pacienteBaixopeso.calculaIMC(),17.41, 0.01);
		assertEquals(pacienteBaixopeso.diagnostico(), Paciente.baixoPesoMsg);
	};
	
	@Test
	void pesonormal() {
		Paciente pacientePesoNormal = new Paciente(62, 1.66);
		System.out.println(pacientePesoNormal.calculaIMC());
		assertEquals(pacientePesoNormal.diagnostico(), "Peso normal");
		assertEquals(pacientePesoNormal.calculaIMC(),22.49, 0.01);

	};

	@Test
	void sobrePeso() {
		Paciente pacienteSobrePeso = new Paciente(69, 1.66);
		System.out.println(pacienteSobrePeso.calculaIMC());
		assertEquals(pacienteSobrePeso.diagnostico(), "Sobrepeso");
		assertEquals(pacienteSobrePeso.calculaIMC(),25.03, 0.01);

	};
	
	@Test
	void obesidadeGrauUm() {
		Paciente pacienteobesidadeGrauUm = new Paciente(85, 1.66);
		System.out.println(pacienteobesidadeGrauUm.calculaIMC());
		assertEquals(pacienteobesidadeGrauUm.diagnostico(), "Obesidade grau I");
		assertEquals(pacienteobesidadeGrauUm.calculaIMC(),30.84, 0.01);
	};
	
	@Test
	void obesidadeGrauDois() {
		Paciente pacienteobesidadeGrauDois = new Paciente(100, 1.66);
		System.out.println(pacienteobesidadeGrauDois.calculaIMC());
		assertEquals(pacienteobesidadeGrauDois.diagnostico(), "Obesidade grau II");
		assertEquals(pacienteobesidadeGrauDois.calculaIMC(),36.28, 0.01);
	};
	
	@Test
	void obesidadeGrauTres() {
		Paciente pacienteobesidadeGrauTres = new Paciente(112, 1.66);
		System.out.println(pacienteobesidadeGrauTres.calculaIMC());
		assertEquals(pacienteobesidadeGrauTres.diagnostico(), "Obesidade grau III (obesidade mórbida)");
		assertEquals(pacienteobesidadeGrauTres.calculaIMC(),40.64, 0.01);
	};
}
