package com.gisia.agendadortarefas.business.mapper;

import com.gisia.agendadortarefas.business.dto.TarefasDTO;
import com.gisia.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
