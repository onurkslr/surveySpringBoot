package com.example.survey.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="topic")
public class Topic {
	@Id
	@Column(name="topic_id")
	private int topic_id;
	@Column(name="topic")
	private String topic;
	@Column(name="npm")
	private double npm;
	public Topic(int topic_id, String topic, double npm) {
		super();
		this.topic_id = topic_id;
		this.topic = topic;
		this.npm = npm;
	}
	public Topic() {
		
	}
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public double getNpm() {
		return npm;
	}
	public void setNpm(double npm) {
		this.npm = npm;
	}
	

}
