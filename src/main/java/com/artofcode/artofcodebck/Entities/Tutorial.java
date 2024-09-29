package com.artofcode.artofcodebck.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tutorialId;
    private String title;
    private String description;
    private Long duration;
    private String video;
    @Enumerated(EnumType.STRING)
    private Level level;
    @Enumerated(EnumType.STRING)
    private TutorialCategory tutorialCategory;
    @ManyToOne
    private CompetitionCandidacy CompetitionCandidacy;
    @ManyToOne
    @JoinColumn(name = "category_id") // Utilisez cette annotation pour la colonne de jointure
    private Category category; // Renommez cette propriété pour correspondre à la propriété mappée dans Category

    @OneToMany(mappedBy = "tutorial", cascade = CascadeType.ALL)
    private List<Comment> comments;
    private int likes; // Compteur de likes
    private int dislikes; // Compteur de dislikes
   @ManyToOne
   @JoinColumn(name = "id")
    private User user;

    public Long getTutorialId() {
        return tutorialId;
    }

    // Setter for tutorialId
    public void setTutorialId(Long tutorialId) {
        this.tutorialId = tutorialId;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for duration
    public Long getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    // Getter for video
    public String getVideo() {
        return video;
    }

    // Setter for video
    public void setVideo(String video) {
        this.video = video;
    }

    // Getter for level
    public Level getLevel() {
        return level;
    }

    // Setter for level
    public void setLevel(Level level) {
        this.level = level;
    }

    // Getter for category
    public Category getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTutorial(Tutorial tutorial) {
    }

    public void setLiked(boolean b) {
    }

    public void setDisliked(boolean b) {
    }

    // Méthode pour ajouter un commentaire à ce tutorial



}

