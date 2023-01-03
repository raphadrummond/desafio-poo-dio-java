import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRaphael = new Dev();
        devRaphael.setName("Raphael");
        devRaphael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Raphael" + devRaphael.getConteudosInscritos());
        devRaphael.progredir();
        devRaphael.progredir();
        devRaphael.progredir();
        devRaphael.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Raphael" + devRaphael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Raphael" + devRaphael.getConteudosConcluidos());
        System.out.println("XP:" + devRaphael.calcularTotalXp());


        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setName("João");
        devRaphael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João" + devRaphael.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }
}