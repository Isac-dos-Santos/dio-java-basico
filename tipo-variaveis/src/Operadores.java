public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.println(nomeCompleto);

        //______________OPERADOR UNARIO______________
        int numeroDeTeste = 5;

        // - -> torna um numero negativo
        numeroDeTeste = - numeroDeTeste;
        System.out.println(numeroDeTeste);

        // + -> torna um numero positivo
        numeroDeTeste =  numeroDeTeste * -1;
        System.out.println(numeroDeTeste);

        // ++ -> encrementa mais 1 
        numeroDeTeste =  ++ numeroDeTeste;
        System.out.println(numeroDeTeste);

        // -- -> subtrai mais 1 
        numeroDeTeste =  -- numeroDeTeste;
        System.out.println(numeroDeTeste);

        // ! -> nega uma expreção
        boolean verdadeiro = true;
        verdadeiro = ! verdadeiro;
        System.out.println(verdadeiro);

        //______________OPERADOR TERNARIO______________
        // operador de condição
        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);
        // ? true : false

        //______________OPERADORES RELACIONAIS______________
        // ==, !=, >, >=, < e <=

        //______________OPERADORES logicos______________
        // &&, ||
    }
}
