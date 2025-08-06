import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(18);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descriçao Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Fernando:" + devFernando.getConteudosInscritos());
        devFernando.progredir();
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos Fernando:" + devFernando.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Fernando:" + devFernando.getConteudosConcluidos());
        System.out.println("XP: " + devFernando.calcularTotalXp());

        System.out.println("-----------");

        Dev devJoana = new Dev();
        devJoana.setNome("Joana");
        devJoana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joana:" + devJoana.getConteudosInscritos());
        devJoana.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos Joana:" + devJoana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joana:" + devJoana.getConteudosConcluidos());
        System.out.println("XP: " + devJoana.calcularTotalXp());


    }

}