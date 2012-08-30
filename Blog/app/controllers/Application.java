package controllers;

import java.util.List;

import models.Blog;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		List<Blog> blogs = Blog.getAllBlogs();
		return ok(index.render(blogs));
	}

}