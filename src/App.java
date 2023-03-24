public class App {
    public static void main(String[] args) throws Exception {
        //INGRESSO E INGRESSO VIP
        System.out.println("====INGRESSOS====");
        Ingresso ingressoPista = new Ingresso();
        IngressoVip ingressoVip = new IngressoVip();

        ingressoPista.valor = 70.00;

        ingressoVip.valor = 70.00;
        ingressoVip.valorAdicional = 35.00;


        System.out.println(ingressoVip.toString());

        //SHOW
        System.out.println("=====SHOW=====");
        Show show1 = new Show();
        show1.nome = "Festa especial para pessoas especiais";
        show1.local = "Bosque bar";
        show1.capacidade = 300;
        show1.artista = "Naldo Benny";

        show1.gravar();
        System.out.println(show1.toString());
        System.out.println(show1.verificarCapacidade(301));

        //FILME
        System.out.println("====FILME====");
        Filme filme1 = new Filme();
        filme1.nome = "A volta dos que nao foram!";
        filme1.local = "Bahia";
        filme1.capacidade = 80;
        filme1.cinema = "Sider Shopping";
        filme1.genero = "Comedia";
        filme1.sala = 302;

        filme1.gravar();
        System.out.println(filme1.toString());
        
        //TEATRO
        System.out.println("====TEATRO====");
        Teatro teatro1 = new Teatro();
        teatro1.nome = "Branca de neve e os 7 anões";
        teatro1.local = "Teatro Municipal do Rio";
        teatro1.capacidade = 120;
        
        teatro1.gravar();
        System.out.println(teatro1.toString());
    }
}
