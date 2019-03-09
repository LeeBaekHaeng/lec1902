package god.com.cmmndetailcode.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface CmmnDetailCodeService {

	List<EgovMap> selectCmmnDetailCodeList(CmmnDetailCodeVO vo) throws Exception;

	int selectCmmnDetailCodeListCnt(CmmnDetailCodeVO vo) throws Exception;

}
