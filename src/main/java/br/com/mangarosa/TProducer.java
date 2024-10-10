package br.com.mangarosa;

import br.com.mangarosa.interfaces.Producer;
import br.com.mangarosa.interfaces.Topic;

public class TProducer implements Producer {
    private final String topic = "Teste";

    @Override
    public void addTopic(Topic topic) {
        // Implementar se necessário
    }

    @Override
    public void removeTopic(Topic topic) {
        // Implementar se necessário
    }

    @Override
    public void sendMessage(String message) {
        // Implementar envio de mensagem
    }

    @Override
    public String name() {
        return topic;
    }
}
