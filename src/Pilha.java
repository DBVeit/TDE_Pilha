public class Pilha {

    private static int topo;//índice do elemento no topo da pilha - posicaoPilha

    private static int[] dados;//array/vetor para armazenamento de dados - object pilha

    private int MAX;//quantidade maxima de elementos

    public Pilha(int maximo){
        this.MAX = maximo;
        this.topo = -1;
        this.dados = new int[MAX];
    }

    public static int topo(){
        if (!vazia()){
            return dados[topo];
        }else{
            System.out.println("Pilha vazia");
            return -1;
        }
    }

    public static boolean vazia(){
        if (topo == -1){
            System.out.println("Pilha vazia");
            return true;
        }else {
            System.out.println("Pilha nao vazia");
            return false;
        }
    }

    public boolean cheia(){
        if (topo == dados.length - 1){
            System.out.println("Pilha cheia");
            return true;
        }else {
            System.out.println("Pilha nao cheia");
            return false;
        }
    }

    public void empilhar (int elemento){
        if (!cheia()){
            topo = topo + 1;
            topo();
            dados[topo] = elemento;
        }else {
            System.out.println("Pilha cheia");
        }
    }

    public int desempilhar(){
        if (!vazia()){
            int valorDesempilhado = dados[topo];
            topo = topo - 1;
            topo();
            return valorDesempilhado;
        }else{
            System.out.println("Pilha vazia");
            return -1;
        }
    }

}
