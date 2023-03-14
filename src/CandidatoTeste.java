public class CandidatoTeste {

    public static void main(String[] args) {
        //Instanciar um objeto
        Candidato candidato = new Candidato();
        candidato.nome = "Lucape";
        candidato.dataNascimento = LocalDate.of(year: 2000, mounth: 10, dayOfMounth: 1);
        candidato.email = "lucaspedrogit@gmail.com";
        candidato.celular= "(11) 92256-7475";
        candidato.escolaridade = "tecnico";
        candidato.funcao = "aluno";
        candidato.pretencaoSalarial = 15000;
        candidato.estaEmpregado = false;
        candidato.aceitaEstagio = true;
    }
}
