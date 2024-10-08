package jholsch.mapstruct.example.target;

import java.time.LocalDate;

public class ProjectInformation {
  private String projectName;
  private LocalDate endDate;

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }
}
