package com.example.EntryProject.entry;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Entry {
    @Id
    @SequenceGenerator(
            name="entry_sequence",
            sequenceName = "entry_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "entry_sequence"
    )
    private Long id;
    private String name;
    private LocalDate startDate;
    private String description;
    private LocalDate endDate;
    private String quickNotes;

    public Entry(Long id, String name, LocalDate startDate, String description, LocalDate endDate, String quickNotes) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.description = description;
        this.endDate = endDate;
        this.quickNotes = quickNotes;
    }
    

    // Getters (returns the value) and setters (mutates the value)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getQuickNotes() {
        return quickNotes;
    }

    public void setQuickNotes(String quickNotes) {
        this.quickNotes = quickNotes;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", description='" + description + '\'' +
                ", endDate='" + endDate + '\'' +
                ", quickNotes='" + quickNotes + '\'' +
                '}';
    }
}
