package god.com.cmmndetailcode.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.com.cmmndetailcode.service.CmmnDetailCodeService;
import god.com.cmmndetailcode.service.CmmnDetailCodeVO;

@Service("CmmnDetailCodeService")
public class CmmnDetailCodeServiceImpl extends EgovAbstractServiceImpl implements CmmnDetailCodeService {

	@Resource(name = "CmmnDetailCodeDAO")
	private CmmnDetailCodeDAO cmmnDetailCodeDAO;

	@Override
	public List<EgovMap> selectCmmnDetailCodeList(CmmnDetailCodeVO vo) throws Exception {
		return cmmnDetailCodeDAO.selectCmmnDetailCodeList(vo);
	}

	@Override
	public int selectCmmnDetailCodeListCnt(CmmnDetailCodeVO vo) throws Exception {
		return cmmnDetailCodeDAO.selectCmmnDetailCodeListCnt(vo);
	}

}
