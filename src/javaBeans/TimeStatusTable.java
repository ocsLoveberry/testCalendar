package javaBeans;

public class TimeStatusTable {
	String seki_no;
	String subjects_cd;
	String start_date;
	String start_time_cd;
	String temp_status;
	String status;
	String comment;
	int count;

	public TimeStatusTable(int count) {
		this.count = count;
	};
	public TimeStatusTable(String seki_no, String subjects_cd, String start_date, String start_time_cd,
			String temp_status, String status, String comment) {
		super();
		this.seki_no = seki_no;
		this.subjects_cd = subjects_cd;
		this.start_date = start_date;
		this.start_time_cd = start_time_cd;
		this.temp_status = temp_status;
		this.status = status;
		this.comment = comment;
	}
	public String getSeki_no() {
		return seki_no;
	}
	public void setSeki_no(String seki_no) {
		this.seki_no = seki_no;
	}
	public String getSubjects_cd() {
		return subjects_cd;
	}
	public void setSubjects_cd(String subjects_cd) {
		this.subjects_cd = subjects_cd;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getStart_time_cd() {
		return start_time_cd;
	}
	public void setStart_time_cd(String start_time_cd) {
		this.start_time_cd = start_time_cd;
	}
	public String getTemp_status() {
		return temp_status;
	}
	public void setTemp_status(String temp_status) {
		this.temp_status = temp_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}



}
