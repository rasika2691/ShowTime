package io.rasika.ShowTime.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.Comment;

@Repository
public class CommentRepositoryImpl implements CommentRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Comment> query=em.createNamedQuery("Comment.findAll", Comment.class);
		return query.getResultList();
	}
	@Override
	public List<Comment> findAllCommentsByMovieId(String id) {
		TypedQuery<Comment> query=em.createNamedQuery("Comment.findAllUserCommentsByMovieId",Comment.class);
		return query.getResultList();
	}

	@Override
	public Comment findOne(String cmtId) {
		// TODO Auto-generated method stub
		return em.find(Comment.class, cmtId);
	}

	@Override
	public Comment create(Comment cmt) {
		// TODO Auto-generated method stub
		em.persist(cmt);
		return cmt;
		
	}

	@Override
	public Comment update(Comment cmt) {
		// TODO Auto-generated method stub
		return em.merge(cmt);
	}

	@Override
	public void delete(Comment cmt) {
		// TODO Auto-generated method stub
		em.remove(cmt)	;
		}

	
	

}
