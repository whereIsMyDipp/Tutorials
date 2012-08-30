package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Ebean;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Blog extends Model {
	@Id
	public Long id;

	@Constraints.Required
	public String header;
	
	@Constraints.Required
	@Column(columnDefinition="TEXT")
	public String text;
	
	//public Date created;
	
	@OneToMany
	public List<Comment> comments;
	
	public static Model.Finder<Long, Blog> find = new Model.Finder<Long, Blog>(
			Long.class, Blog.class);
	
	public static List<Blog> getAllBlogs() {
		List<Blog> blogs = new ArrayList<Blog>();
		blogs = Ebean.find(Blog.class)
				.findList(); 
		return blogs; 
	}
}