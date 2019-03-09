package god.com.cmmndetailcode.service;

import egovframework.com.cmm.ComDefaultVO;

@SuppressWarnings("serial")
public class CmmnDetailCodeVO extends ComDefaultVO {

	private String codeId;

	private String code;

	private String codeNm;

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeNm() {
		return codeNm;
	}

	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}

}
