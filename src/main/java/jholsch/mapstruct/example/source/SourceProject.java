package jholsch.mapstruct.example.source;

import java.time.LocalDate;

public class SourceProject {
  private String name;
  private LocalDate dueDate;

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
