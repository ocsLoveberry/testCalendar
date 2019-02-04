package dto;

public class CalendarDTO {
	public int id;
	public String title;
	public String start;
	public String end;
	public String color;

	public CalendarDTO() {
		super();
	}



	public CalendarDTO(String title, String start, String end) {
		super();
		this.title = title;
		this.start = start;
		this.end = end;
	}


	public CalendarDTO(int id, String title, String start, String end, String color) {
		super();
		this.id = id;
		this.title = title;
		this.start = start;
		this.end = end;
		this.color = color;
	}



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
}