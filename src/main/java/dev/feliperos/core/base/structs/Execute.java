package dev.feliperos.core.base.structs;

import java.util.Optional;

/**
 * Representação da Estrutura de execução de um comando no Redis.
 *
 * @author Felipe, Felipe Ros. Created on 01/03/2024
 * @since 1.0
 * @version 1.0
 *
 * @param <T> Tipo do retorno.
 */
public interface Execute<T> {

    /**
     * Utilizado para executar os Comandos no Redis.
     *
     * @return {@link Optional} retorna o resultado do Comando.
     */
    Optional<T> execute();
}
