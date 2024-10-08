package jholsch.mapstruct.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import jholsch.mapstruct.example.source.SourceProject;
import jholsch.mapstruct.example.source.SourceScrumProject;
import jholsch.mapstruct.example.target.TargetProject;
import jholsch.mapstruct.example.target.TargetScrumProject;

class MapperTest {

  @Test
  void mapScrumProjectInformation() {
    ProjectMapper mapper = Mappers.getMapper(ProjectMapper.class);

    SourceScrumProject sourceScrumProject = new SourceScrumProject();
    sourceScrumProject.setDueDate(LocalDate.MAX);
    sourceScrumProject.setName("Test Scrum Project");
    sourceScrumProject.setVelocity(Integer.MAX_VALUE);

    TargetScrumProject targetScrumProject =
        (TargetScrumProject) mapper.mapProject(sourceScrumProject);

    assertEquals(LocalDate.MAX, targetScrumProject.getProjectInformation().getEndDate());
  }

  @Test
  void mapProjectInformation() {
    ProjectMapper mapper = Mappers.getMapper(ProjectMapper.class);

    SourceProject sourceProject = new SourceProject();
    sourceProject.setDueDate(LocalDate.MAX);
    sourceProject.setName("Test Scrum Project");

    TargetProject targetProject = mapper.mapProject(sourceProject);

    assertEquals(LocalDate.MAX, targetProject.getProjectInformation().getEndDate());
  }

}
