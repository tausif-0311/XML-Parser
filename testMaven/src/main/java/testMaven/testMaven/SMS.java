package testMaven.testMaven;

import javax.xml.bind.annotation.XmlElement;

public class SMS {

	public SMS() {
	}

	
	private String resCode;
	
	private String resDesc;

	public SMS(String resCode, String resDesc) {
		super();
		this.resCode = resCode;
		this.resDesc = resDesc;
	}

	@XmlElement(name = "ResCode")
	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	@XmlElement(name = "ResDesc")
	public String getResDesc() {
		return resDesc;
	}

	public void setResDesc(String resDesc) {
		this.resDesc = resDesc;
	}

	@Override
	public String toString() {
		return "SMS [resCode=" + resCode + ", resDesc=" + resDesc + "]";
	}

}
