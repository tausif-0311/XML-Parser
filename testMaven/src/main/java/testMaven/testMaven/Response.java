package testMaven.testMaven;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
public class Response {

	private String refNo;
	@XmlElement(name = "Email")
	private Email email;
	@XmlElement(name = "SMS")
	private SMS sms;

	public Response() {
	}

	public Response(String refNo, Email email, SMS sms) {
		super();
		this.refNo = refNo;
		this.email = email;
		this.sms = sms;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public SMS getSms() {
		return sms;
	}

	public void setSms(SMS sms) {
		this.sms = sms;
	}

	@Override
	public String toString() {
		return "Response [refNo=" + refNo + ", email=" + email + ", sms=" + sms + "]";
	}

}
