import java.util.Date;

public class Curso {
    int Carga_horária;
    String Nome;
    String Modalidade;
    Date Data_inicio;
    Date Data_final;
    Boolean Gratuito;
    float Media;

    void printNome(){
        System.out.println(this.Nome);
        System.out.println(this.Carga_horária);
        System.out.println(this.Modalidade);
        System.out.println(this.Data_inicio);
        System.out.println(this.Data_final);
        System.out.println(this.Gratuito);
        System.out.println(this.Media);
    }

}
