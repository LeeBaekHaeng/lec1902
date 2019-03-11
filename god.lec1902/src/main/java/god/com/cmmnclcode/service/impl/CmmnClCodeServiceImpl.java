package god.com.cmmnclcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.com.cmmnclcode.service.CmmnClCodeService;
import god.com.cmmnclcode.service.CmmnClCodeVO;

@Service("CmmnClCodeService")
public class CmmnClCodeServiceImpl extends EgovAbstractServiceImpl implements CmmnClCodeService {

	@Resource(name = "CmmnClCodeDAO")
	private CmmnClCodeDAO cmmnClCodeDAO;

	@Override
	public List<EgovMap> selectCmmnClCodeList(CmmnClCodeVO vo) throws Exception {
		return cmmnClCodeDAO.selectCmmnClCodeList(vo);
	}

}
