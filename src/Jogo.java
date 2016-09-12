public class Jogo {
	public Dado primeiroDado = new Dado() ;
	public Dado segundoDado = new Dado() ;
	public Dado terceiroDado = new Dado() ;
	public String resultado;
	public void jogar() {
            
            primeiroDado.lancar();
            segundoDado.lancar();
            terceiroDado.lancar();
            
            int soma = primeiroDado.valorDaFace + segundoDado.valorDaFace + terceiroDado.valorDaFace;
            
            if (soma == 18) {
               resultado = "VENCEU!";
            }
            else {
               resultado = "PERDEU!";
                
            }
            
            System.out.println("Soma: " + soma);
           
        }
	public void apresentarResultado() {
            
            System.out.println("Resultado do jogo: " + resultado);
	}
}
