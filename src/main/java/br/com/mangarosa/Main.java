package br.com.mangarosa;

import br.com.mangarosa.messages.Message;
import io.lettuce.core.RedisClient;

public class Main {
    public static void main(String[] args) {
        RedisClient redisClient = RedisClient.create("redis://localhost:6379");
        RedisMessageRepository messageRepository = new RedisMessageRepository(redisClient);

        // Exemplo de uso
        TProducer producer = new TProducer();
        Message msg = new Message(producer, "Teste de mensagem");
        messageRepository.append(producer.name(), msg);
        
        // Aqui você pode adicionar consumidores e fazer mais operações...

        redisClient.shutdown();
    }
}
