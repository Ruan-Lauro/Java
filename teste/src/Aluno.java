import java.util.Date;

public class Aluno {
    String Nome;
    Date Data_Nascimento;
    String Email;

    void printname(){
        System.out.println(this.Nome);
        System.out.println(this.Data_Nascimento);
        System.out.println(this.Email);
    }
}
