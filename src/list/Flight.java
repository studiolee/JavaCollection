package list;

public class Flight {
	private int fno;
	private String fModel;
	private String fStartPort;
	private String fEndPort;
	private String startTime;
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getfModel() {
		return fModel;
	}
	public void setfModel(String fModel) {
		this.fModel = fModel;
	}
	public String getfStartPort() {
		return fStartPort;
	}
	public void setfStartPort(String fStartPort) {
		this.fStartPort = fStartPort;
	}
	public String getfEndPort() {
		return fEndPort;
	}
	public void setfEndPort(String fEndPort) {
		this.fEndPort = fEndPort;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Flight(int fno, String fModel, String fStartPort, String fEndPort, String startTime) {
		super();
		this.fno = fno;
		this.fModel = fModel;
		this.fStartPort = fStartPort;
		this.fEndPort = fEndPort;
		this.startTime = startTime;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Flight [fno=" + fno + ", fModel=" + fModel + ", fStartPort=" + fStartPort + ", fEndPort=" + fEndPort
				+ ", startTime=" + startTime + "]";
	}
	
}
