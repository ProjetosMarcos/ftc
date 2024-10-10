package br.com.mangarosa.interfaces;

import br.com.mangarosa.messages.Message;

import java.util.List;
import java.util.UUID;

public interface MessageRepository {
    void append(String topic, Message message);
    void consumeMessage(String topic, UUID messageId);
    List<Message> getAllNotConsumedMessagesByTopic(String topic);
    List<Message> getAllConsumedMessagesByTopic(String topic);
}
