package jholsch.mapstruct.example;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.SubclassMapping;
import jholsch.mapstruct.example.source.SourceProject;
import jholsch.mapstruct.example.source.SourceScrumProject;
import jholsch.mapstruct.example.target.TargetProject;
import jholsch.mapstruct.example.target.TargetScrumProject;

@Mapper(uses = ScrumProjectMapper.class)
@MapperConfig
public interface ProjectMapper {
  @Mappings
  @SubclassMapping(source = SourceScrumProject.class, target = TargetScrumProject.class)
  TargetProject mapProject(SourceProject source);

  @Mapping(target = "projectInformation.projectName", source = "name")
  @Mapping(target = "projectInformation.endDate", source = "dueDate")
  @interface Mappings {
  }
}
