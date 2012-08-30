package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Ebean;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Comment extends Model {
	@Id
	public Long id;

	@Constraints.Required
	public String text;
	
	@ManyToOne
	public Blog blog;
	
	//public Date created;
	
	public static Model.Finder<Long, Comment> find = new Model.Finder<Long, Comment>(
			Long.class, Comment.class);
	
	public static List<Comment> getAllComments() {
		List<Comment> comments = new ArrayList<Comment>();
		comments = Ebean.find(Comment.class).findList(); 
		return comments; 
	}
}