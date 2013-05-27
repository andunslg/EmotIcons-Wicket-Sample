package com.googlecode.wicket.jquery.ui.plugins.emoticons.sample;

import com.googlecode.wicket.jquery.ui.plugins.emoticons.EmotIconsBehavior;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;


public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
		this.add(new EmotIconsBehavior(".class","emoticonize"));
		this.add(new EmotIconsBehavior(".class2","unemoticonize"));
		this.add(new EmotIconsBehavior("#id2","unemoticonize"));
		this.add(new EmotIconsBehavior("#id3","emoticonize"));
		this.add(new EmotIconsBehavior("#id4","unemoticonize"));
    }
}
