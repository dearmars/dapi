package jp.tsite.tsutaya_passport.dapi;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TPMember implements Serializable {

	private static final long serialVersionUID = -5393206749751517285L;

	private String shopCode;

	private String TMemberNumber;

	public String getShopCode() {
		return shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getTMemberNumber() {
		return TMemberNumber;
	}

	public void setTMemberNumber(String tMemberNumber) {
		TMemberNumber = tMemberNumber;
	}
	
}
