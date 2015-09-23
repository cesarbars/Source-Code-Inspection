package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 *
 */

public class PapelMoedaInvalidaException extends Exception {
    public PapelMoedaInvalidaException(String message) {
        message = "Falha ao validar papel moeda";
    }
}