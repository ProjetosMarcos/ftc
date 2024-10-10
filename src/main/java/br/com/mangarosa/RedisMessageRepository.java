package br.com.mangarosa;

import br.com.mangarosa.interfaces.MessageRepository;
import br.com.mangarosa.messages.Message;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

import java.util.List;
import java.util.UUID;

public class RedisMessageRepository implements MessageRepository {
    private final RedisCommands<String, String> syncCommands;

    public RedisMessageRepository(RedisClient redisClient) {
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        this.syncCommands = connection.sync();
    }

    @Override
    public void append(String topic, Message message) {
        // Serialização da mensagem em JSON
        syncCommands.xadd(topic, message.getMessage());
    }

    @Override
    public void consumeMessage(String topic, UUID messageId) {
        // Implementar lógica para marcar a mensagem como consumida
    }

    @Override
    public List<Message> getAllNotConsumedMessagesByTopic(String topic) {
        // Implementar lógica para retornar mensagens não consumidas
        return null;
    }

    @Override
    public List<Message> getAllConsumedMessagesByTopic(String topic) {
        // Implementar lógica para retornar mensagens consumidas
        return null;
    }
}
