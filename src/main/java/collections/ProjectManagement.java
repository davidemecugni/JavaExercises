package collections;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

class Project{
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private final Set<Task> tasks;

    public Project(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = new HashSet<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
        if(task.getProject() != this){
            task.setProject(this);
        }
    }

    public void removeTask(Task task){
        tasks.remove(task);
        task.setProject(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name) && Objects.equals(startDate, project.startDate) && Objects.equals(endDate, project.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

class Employee{
    private String name;
    private String lastName;
    private String socialSecurityCode;

    public Employee(String name, String lastName, String socialSecurityCode) {
        this.name = name;
        this.lastName = lastName;
        this.socialSecurityCode = socialSecurityCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityCode() {
        return socialSecurityCode;
    }

    public void setSocialSecurityCode(String socialSecurityCode) {
        this.socialSecurityCode = socialSecurityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName) && Objects.equals(socialSecurityCode, employee.socialSecurityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, socialSecurityCode);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityCode='" + socialSecurityCode + '\'' +
                '}';
    }
}


class Task{
    private final UUID uuid;
    private String description;
    private Integer hoursNeeded;
    private Project project;
    private Employee teamLeader;

    public Task(String description, Integer hoursNeeded) {
        this.description = description;
        this.hoursNeeded = hoursNeeded;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHoursNeeded() {
        return hoursNeeded;
    }

    public void setHoursNeeded(Integer hoursNeeded) {
        this.hoursNeeded = hoursNeeded;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        if(Objects.nonNull(this.project) && this.project.getTasks().contains(this)){
            this.project.removeTask(this);
        }
        if(Objects.nonNull(project)){
            project.getTasks().add(this);
        }
        this.project = project;
    }

    public Employee getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Employee teamLeader) {
        this.teamLeader = teamLeader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(uuid, task.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(uuid);
    }

    @Override
    public String toString() {
        return "Task{" +
                "uuid=" + uuid +
                ", description='" + description + '\'' +
                ", hoursNeeded=" + hoursNeeded +
                '}';
    }
}