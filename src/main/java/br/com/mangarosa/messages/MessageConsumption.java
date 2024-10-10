package br.com.mangarosa.messages;

import br.com.mangarosa.interfaces.Consumer;

import java.time.LocalDateTime;

public class MessageConsumption {
    private final Consumer consumer;
    private final LocalDateTime consumedAt;

    public MessageConsumption(Consumer consumer) {
        this.consumer = consumer;
        this.consumedAt = LocalDateTime.now();
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public LocalDateTime getConsumedAt() {
        return consumedAt;
    }
}
