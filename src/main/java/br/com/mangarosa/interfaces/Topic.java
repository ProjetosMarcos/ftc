package br.com.mangarosa.interfaces;

import br.com.mangarosa.messages.Message;

import java.io.Serializable;
import java.util.List;

public interface Topic extends Serializable {
    String name();
    void addMessage(Message message);
    void subscribe(Consumer consumer);
    void unsubscribe(Consumer consumer);
    List<Consumer> consumers();
    MessageRepository getRepository();
}
