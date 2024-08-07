package com.br.forumhubalura.forum.model.projections;

import java.time.LocalDateTime;

public interface AnswerSlim {
    Long getId();

    String getMessage();

    LocalDateTime getCreatedAt();

    UserSlim getAuthor();
}
