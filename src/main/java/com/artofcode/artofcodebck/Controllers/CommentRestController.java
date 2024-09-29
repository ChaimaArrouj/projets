package com.artofcode.artofcodebck.Controllers;

import com.artofcode.artofcodebck.Entities.Comment;
import com.artofcode.artofcodebck.Services.Comment.ICommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200/api")
@RequestMapping("/comments")
public class CommentRestController {
    private final ICommentService commentService;

}
