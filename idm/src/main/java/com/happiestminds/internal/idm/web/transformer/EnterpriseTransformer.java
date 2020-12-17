package com.happiestminds.internal.idm.web.transformer;

import com.happiestminds.internal.idm.dataaccess.entities.Enterprise;
import com.happiestminds.internal.idm.web.model.EnterpriseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EnterpriseTransformer {

  EnterpriseTransformer INSTANCE = Mappers.getMapper(EnterpriseTransformer.class);

  EnterpriseDto toDto(Enterprise enterprise);

  List<EnterpriseDto> toDto(List<Enterprise> enterprise);
}
