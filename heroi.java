public class heroi {
//criação dos atributos (caracteristicas do objeto)
String nome,poder,origem;
int idade;
double altura;

//métodos (ações do objeto)
// método void (não tem retorno)

void salvar(){
    System.out.println("O herói está salvando as vítimas");
}
void planar(){
    System.out.println("O herói está planando, é o supermein?");
}
void lutar(){
    System.out.println("O herói esta lutando");
}


}


// atributos do heroi 

public class testaheroi {

public static void main(String[] args) {


    heroi batma = new heroi();
    batma.nome = "clarque kente";
    batma.idade = 10;
    batma.altura = 2.0;
    batma.origem = "cisjordania";
    batma.poder = "nenhum";

    batma.lutar();
    batma.salvar();
    batma.planar();

    

 System.out.println("ele não tem "+batma.poder+ " poder");


}


}
