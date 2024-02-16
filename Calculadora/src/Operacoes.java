public class Operacoes extends MainPanel{

    int x;
    int y;
    void Soma(int x , int y){
        int z = x + y;
        String resposta = String.valueOf(z);
        text.setText(resposta);
        System.out.println(z);
    }
}

