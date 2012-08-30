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
			blog.text = "Firtst Blog text";
			blog.save();

			Blog blog2 = new Blog();
			blog2.header = "Blog Header #2";
			blog2.text = "Second blog text";
			blog2.save();
		}
	}

	public void onStop(Application app) {
		
		Logger.info("Application shutdown...");
	}
}