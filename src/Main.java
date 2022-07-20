import br.com.dio.desafio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSoraya = new Dev();
        devSoraya.setNome("Soraya");
        devSoraya.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Soraya:" + devSoraya.getConteudosInscritos());
        devSoraya.progredir();
        devSoraya.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Soraya:" + devSoraya.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Soraya:" + devSoraya.getConteudosConcluidos());
        System.out.println("XP:" + devSoraya.calcularTotalXp());

        System.out.println("----------------");


        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro");
        devLeandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Leandro" + devLeandro.getConteudosInscritos());
        devLeandro.progredir();
        devLeandro.progredir();
        devLeandro.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Leandro" + devLeandro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Leandro" + devLeandro.getConteudosConcluidos());
        System.out.println("XP:" + devLeandro.calcularTotalXp());


    }
}
