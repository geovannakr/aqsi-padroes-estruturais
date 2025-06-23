package situacoes.adapter.adapters;

import situacoes.adapter.interfaces.NotificationInterface;
import situacoes.adapter.services.EmailServiceNew;

public class NotificationAdapter implements NotificationInterface {

    EmailServiceNew emailServiceNew = new EmailServiceNew();

    @Override
    public void enviar(String mensagem) {
        emailServiceNew.setupMessage(mensagem);
        System.out.println(emailServiceNew.send());
    }

    
}