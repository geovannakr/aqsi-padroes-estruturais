import situacoes.adapter.adapters.NotificationAdapter;
import situacoes.adapter.interfaces.NotificationInterface;

public class Main {
    public static void main(String[] args) {
        NotificationInterface notificationAdapter = new NotificationAdapter();
    
        notificationAdapter.enviar("Teste");
    }
}