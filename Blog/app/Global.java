import play.*;
import java.math.BigDecimal;
import java.util.*;

import com.avaje.ebean.*;

import models.*;

public class Global extends GlobalSettings {

	public void onStart(Application app) {
		System.out.println(Ebean.find(Blog.class).findRowCount());
		if (Ebean.find(Blog.class).findRowCount() == 0) {
			Logger.info("Init Data");
			
			

			Blog blog = new Blog();
			blog.header = "BlogHeader #1";
			blog.text = "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus." +
					" Donec nunc tellus, suscipit at posuere a, iaculis eget felis. In commodo tortor non ante pulvinar molestie. " +
					"Curabitur metus augue, pellentesque ac convallis vel, lacinia at neque. Aliquam rhoncus dignissim lacus suscipit fermentum. " +
					"Vivamus fringilla libero in lectus pretium pretium quis vel dui. Aliquam adipiscing interdum auctor." +
					" Fusce laoreet dapibus quam, at blandit enim imperdiet ac. Praesent ullamcorper velit nec mi dignissim ultricies.";
			blog.save();

			Blog blog2 = new Blog();
			blog2.header = "Blog Header #2";
			blog2.text = "Aenean sollicitudin justo quis justo iaculis eget sagittis nulla convallis. " +
					"Duis vitae iaculis tortor. Cras elementum ipsum id tellus rutrum et rutrum tortor facilisis. " +
					"Sed ut magna risus. Phasellus volutpat eros lectus, eget adipiscing metus. Morbi laoreet consectetur sapien rhoncus suscipit. " +
					"Vestibulum in pulvinar sapien. Nunc a lacus at sem sagittis blandit sed convallis nibh. " +
					"Pellentesque magna lorem, iaculis lacinia aliquam eu, pulvinar sed dui." +
					" Aenean pellentesque ullamcorper malesuada.";
			blog2.save();
			
			Comment c = new Comment();
			c.text = " Suspendisse malesuada pellentesque sapien et aliquet. Duis varius neque vel enim mattis consectetur. Cras ac nisl urna. Duis ornare, erat nec aliquet dapibus, ligula ante congue dolor, sit amet consectetur metus mi ac metus. ";
			c.blog = blog;
			c.save();
			
			Comment c1 = new Comment();
			c1.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam et justo enim. Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
			c1.blog = blog;
			c1.save();
			
			Comment c2 = new Comment();
			c2.text = "Aenean mollis consectetur sem, eu laoreet risus placerat non.";
			c2.blog = blog2;
			c2.save();
		}
	}

	public void onStop(Application app) {
		Logger.info("Application shutdown...");
		
	}
}