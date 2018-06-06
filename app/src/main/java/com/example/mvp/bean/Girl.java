package com.example.mvp.bean;

/**
 * 实体
 */
public class Girl {

	public String icon;
	public String like;
	public String style;

	public Girl() {
	}

	public Girl(String icon, String like, String style) {
		super();
		this.icon = icon;
		this.like = like;
		this.style = style;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
