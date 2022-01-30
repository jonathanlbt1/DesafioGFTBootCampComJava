import java.time.LocalDate;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devjonathan = new Dev();
        devjonathan.setNome("Jonathan");
        devjonathan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jonathan:" + devjonathan.getConteudosInscritos());
        devjonathan.progredir();
        devjonathan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jonathan:" + devjonathan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jonathan:" + devjonathan.getConteudosConcluidos());
        System.out.println("XP:" + devjonathan.calcularTotalXp());

        System.out.println("-------");


    }

}