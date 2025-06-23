package situacoes.adapter.services;

public class EmailServiceNew {
    
    private String message;
    
        public void setupMessage(String texto){
            this.message = texto;
        }

        public String send(){
            return "Mensagem enviada pelo sistema novo: " + this.message;
        }
}
