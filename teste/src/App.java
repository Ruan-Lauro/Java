import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, pessoal");

        Date data = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse("17/02/2022"); 
        Date date1 = formatter.parse("26/05/2004");

        Curso ads = new Curso();
        ads.Nome = "Análise e Desenvolvimento de Sistemas";
        ads.Carga_horária = 2190;
        ads.Modalidade = "Presencial";
        ads.Data_inicio = date;
        ads.Data_final = data;
        ads.Gratuito = true;
        ads.Media = 7;
    

        Aluno Alu_ads = new Aluno();
        Alu_ads.Nome = "Ruan Lauro Cardoso da Silva Monteiro";
        Alu_ads.Email = "ruanmonteirolauro@gmail.com";
        Alu_ads.Data_Nascimento = date1;

        Professor professor = new Professor();
        professor.Nome = "Jesiel Viana da Silva";
        professor.Formacao = "Mestre";
        professor.Email = "jesiel@ifpi.edu.br";

        Certificado certificado = new Certificado();
        certificado.Codigo = 11011101;
        certificado.aluno = Alu_ads;
        certificado.curso = ads;
  


    }

}
