package jholsch.mapstruct.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import jholsch.mapstruct.example.source.SourceScrumProject;
import jholsch.mapstruct.example.target.TargetScrumProject;

@Mapper
public interface ScrumProjectMapper {
  @Mapping(target = "velocity.value", source = "velocity")
  @ProjectMapper.Mappings
  TargetScrumProject mapScrumProject(SourceScrumProject source);
}
