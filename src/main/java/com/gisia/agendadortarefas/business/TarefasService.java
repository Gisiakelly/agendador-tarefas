package com.gisia.agendadortarefas.business;

import com.gisia.agendadortarefas.business.dto.TarefasDTO;
import com.gisia.agendadortarefas.business.mapper.TarefasConverter;
import com.gisia.agendadortarefas.infrastructure.entity.TarefasEntity;
import com.gisia.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.gisia.agendadortarefas.infrastructure.repository.TarefasRepository;
import com.gisia.agendadortarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefasConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        TarefasEntity entity = tarefasConverter.paraTarefaEntity(dto);

        return tarefasConverter.paraTarefaDTO(
                tarefasRepository.save(entity));
    }
}
