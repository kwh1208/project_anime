package anime.project.repository;

import anime.project.domain.Comment;

import java.util.List;

public interface CommentRepository {
    public void insert(Comment comment);
    public void update(Comment comment);
    public void delete(Comment comment);
    public List<Comment> findCommentByMember(String id);
    public List<Comment> findCommentByAnime(String name);
    public List<Comment> findCommentByComment(String name);
}
