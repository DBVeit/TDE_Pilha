public class Expressao {

    //Funcao verificaDelimitadores para inserir a expressao e verificar se é valida
    public static boolean verificaDelimitadores(String expressao){

        //Atribui a pilha à variavel p com parametro o tamanho da expressao
        Pilha p = new Pilha(expressao.length());

        //Loop para iterar na pilha (expressao)
        for (int i = 0; i < expressao.length(); i++){

            //Atribuicao de variavel para os caracteres
            char caractere = expressao.charAt(i);

            //Estrutura condicional para empilhar apenas quando os caracteres forem parenteses, chaves ou colchetes
            if (caractere == '(' || caractere == '{' || caractere == '['){
                p.empilhar(caractere);
            } else if (caractere == ')' || caractere == '}' || caractere == ']') {
                if (p.vazia()){
                    return false;
                }
                //Se a pilha estiver vazia retorna a funcao vazia quando tenta validar os caracteres de fechamento

                //Desempilha
                char topo = (char) p.desempilhar();
                if ( (caractere == ')' && topo != '(') || (caractere == '}' && topo != '{') || (caractere == ']' && topo != '[') ){
                    return false;
                }//Verifica se o caractere inserido é contrário ao que está no topo - se não é um fechamento deve retornar invalido
            }
        }
        return p.vazia();
    }

}