package br.com.mangarosa.interfaces;

import br.com.mangarosa.messages.Message;

import java.io.Serializable;

/**
 * Um consumidor é responsável por processar as mensagens enviadas
 * por um produtor.
 */
public interface Consumer extends Serializable {
    boolean consume(Message message);
    String name();
}
