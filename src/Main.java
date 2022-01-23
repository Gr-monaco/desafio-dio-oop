import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Python");
        curso1.setDescricao("Descrição de Python");
        curso1.setCargaHoraria(12);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição de C#");
        curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Python");
        mentoria.setDescricao("Descrição da mentoria python");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
