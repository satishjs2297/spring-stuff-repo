package rewardsonline.accounts.view;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/**
 * View resolver for returning JSON in a view-based system. Always returns a
 * {@link MappingJacksonJsonView}.
 */
public class JsonViewResolver implements ViewResolver {

	/**
	 * Get the view to use.
	 * 
	 * @return Always returns an instance of {@link MappingJacksonJsonView}.
	 */
	//@Override
	public View resolveViewName(String viewName, Locale locale)
			throws Exception {
		System.out.println("JsonViewResolver#resolveViewName");
		MappingJacksonJsonView view = new MappingJacksonJsonView();
		view.setPrettyPrint(true);
		return view;
	}

}
