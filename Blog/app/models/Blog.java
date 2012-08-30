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
	public String text;
	
	public Date created;
	
	@OneToMany
	public List<Comment> comments;
	
	public static Model.Finder<Long, Blog> find = new Model.Finder<Long, Blog>(
			Long.class, Blog.class);
	
	public static List<Blog> getAllBlogs() {
		List<Blog> menus = new ArrayList<Blog>();
		menus = Ebean.find(Blog.class).findList(); 
		return menus; 
	}
}