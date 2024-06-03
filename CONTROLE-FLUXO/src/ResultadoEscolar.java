public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
    
        if(nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7);
            System.out.println("Prova de recuperação");
            
            System.out.println("Reprovado");
    }
}
// CONDIÇÃO TERNARIA 
//CENARIO 1
//public class ResultadoEscolar {
// public static void main(String[] args) {
//		int nota = 7;
//		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
//		System.out.println(resultado);
//	    }
//  }

//CENARIO 2 
//public class ResultadoEscolar {
//	public static void main(String[] args) {
//		int nota = 6;
//		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
//		System.out.println(resultado);
//	    }
//  }