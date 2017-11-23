package br.com.reclamacao.service.test.domain.service;

import br.com.reclamacao.service.test.domain.model.Reclamacao;

import java.util.Set;

public interface ReclamacaoService {

    Reclamacao salva (Reclamacao reclamacao);

    Set<Reclamacao> busca();

    void deleta(String id);

    void edita(Reclamacao reclamacao, String id);

    Reclamacao buscaPorId(String id);
}
