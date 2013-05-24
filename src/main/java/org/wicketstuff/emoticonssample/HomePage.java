package org.wicketstuff.emoticonssample;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.emoticons.EmotIconsBehavior;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
	    EmotIconsBehavior emotIconsBehavior=new EmotIconsBehavior();
		emotIconsBehavior.addEmoticonize(".class");
		emotIconsBehavior.addUnemoticonize(".class2");
		emotIconsBehavior.addUnemoticonize("#id2");
		emotIconsBehavior.addEmoticonize("#id3");
		emotIconsBehavior.addUnemoticonize("#id4");
		this.add(emotIconsBehavior);
    }
}
