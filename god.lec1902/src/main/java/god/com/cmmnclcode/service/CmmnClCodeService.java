package god.com.cmmnclcode.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface CmmnClCodeService {

	List<EgovMap> selectCmmnClCodeList(CmmnClCodeVO vo) throws Exception;

}
