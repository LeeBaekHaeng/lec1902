package god.com.cmmndetailcode.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.com.cmmndetailcode.service.CmmnDetailCodeVO;

@Repository("CmmnDetailCodeDAO")
public class CmmnDetailCodeDAO extends EgovComAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<EgovMap> selectCmmnDetailCodeList(CmmnDetailCodeVO vo) throws Exception {
		return (List<EgovMap>) list("CmmnDetailCodeDAO.selectCmmnDetailCodeList", vo);
	}

	public int selectCmmnDetailCodeListCnt(CmmnDetailCodeVO vo) throws Exception {
		return (int) select("CmmnDetailCodeDAO.selectCmmnDetailCodeListCnt", vo);
	}

}
