package anime.project.reposirotyImpl;

import anime.project.domain.Comment;
import anime.project.repository.CommentRepository;

import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    @Override
    public void insert(Comment comment) {

    }

    @Override
    public void update(Comment comment) {

    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public List<Comment> findCommentByMember(String id) {
        return null;
    }

    @Override
    public List<Comment> findCommentByAnime(String name) {
        return null;
    }

    @Override
    public List<Comment> findCommentByComment(String name) {
        return null;
    }
}
