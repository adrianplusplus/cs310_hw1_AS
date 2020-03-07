package Data;

public class DataClass {

	private String dataName;
	private int dataID;

	public DataClass(String dataName, int dataID) {
		super();
		this.dataName = dataName;
		this.dataID = dataID;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public int getDataID() {
		return dataID;
	}

	public void setDataID(int dataID) {
		this.dataID = dataID;
	}

	@Override
	public String toString() {
		return String.format("ID = " + this.dataID + " , Name = " + this.dataName);
	}

}
