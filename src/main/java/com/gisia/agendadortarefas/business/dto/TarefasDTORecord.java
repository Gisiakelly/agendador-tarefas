package com.gisia.agendadortarefas.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gisia.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;

import java.time.LocalDateTime;

public record TarefasDTORecord(String id,
                               String nomeTarefa,
                               String Descricao,
                               @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                               LocalDateTime dataCriacao,
                               @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                               LocalDateTime dataEvento,
                               String emailUsuario,
                               @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                               LocalDateTime dataAlteracao,
                               StatusNotificacaoEnum statusNotificacaoEnum) {
}
