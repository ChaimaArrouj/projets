package com.artofcode.artofcodebck.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Comment implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long commentId;
 private String content;
 @Temporal(TemporalType.TIMESTAMP)
 @Column(nullable = false)
 private LocalDateTime createdAt;

 @ManyToOne
 @JoinColumn(name = "tutorial_id")
 @JsonIgnore // Ignore this field during serialization to break the circular reference
 private Tutorial tutorial;
 @ManyToOne
 @JoinColumn(name = "user_id") // Cette annotation crée la colonne de jointure
 private User user;


 public String getContent() {
  return content;
 }

 public void setContent(String content) {
  this.content = content;
 }

 public Comment() {
  this.createdAt = LocalDateTime.now(); // Initialise createdAt avec l'heure actuelle
 }


 public void setTutorialId(Long tutorialId) {
 }
}




