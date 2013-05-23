package org.wicketstuff.emoticonssample;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.emoticons.EmotIconsBehavior;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
	    EmotIconsBehavior emotIconsBehavior=new EmotIconsBehavior();
		emotIconsBehavior.addEmoticonizeClass("class");
		emotIconsBehavior.addUnemoticonizeClass("class2");
		emotIconsBehavior.addUnemoticonizeId("id2");
		emotIconsBehavior.addEmoticonizeId("id3");
		emotIconsBehavior.addUnemoticonizeId("id4");
		this.add(emotIconsBehavior);
    }
}
