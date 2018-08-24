package testMaven.testMaven;

import javax.xml.bind.annotation.XmlElement;

public class Email {

	public Email() {
	}

	public Email(String resCode, String resDesc) {
		super();
		this.resCode = resCode;
		this.resDesc = resDesc;
	}

	private String resCode;
	private String resDesc;

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
		return "Email [resCode=" + resCode + ", resDesc=" + resDesc + "]";
	}

}
