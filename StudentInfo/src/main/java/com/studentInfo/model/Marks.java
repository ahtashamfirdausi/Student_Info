/*
 * package com.studentInfo.model;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.Id; import
 * javax.persistence.OneToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "Marks") public class Marks {
 * 
 * @Id
 * 
 * @GeneratedValue
 * 
 * @OneToOne(mappedBy = "id") private double Id;
 * 
 * @Column(name = "Subject", length = 30, nullable = false) private String
 * subject;
 * 
 * @Column(name = "Grade", length = 5, nullable = false) private String grade;
 * 
 * public Marks() { super();
 * 
 * }
 * 
 * public Marks(double Id, String subject, String grade) { super(); this.Id =
 * Id; this.subject = subject; this.grade = grade; }
 * 
 * public double getNo() { return Id; }
 * 
 * public void setNo(double no) { this.Id = no; }
 * 
 * public String getSubject() { return subject; }
 * 
 * public void setSubject(String subject) { this.subject = subject; }
 * 
 * public String getGrade() { return grade; }
 * 
 * public void setGrade(String grade) { this.grade = grade; }
 * 
 * }
 */