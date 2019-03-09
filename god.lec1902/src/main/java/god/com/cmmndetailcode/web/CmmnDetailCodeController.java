package god.com.cmmndetailcode.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import god.com.cmmndetailcode.service.CmmnDetailCodeService;
import god.com.cmmndetailcode.service.CmmnDetailCodeVO;

@Controller
public class CmmnDetailCodeController {

	@Resource(name = "CmmnDetailCodeService")
	private CmmnDetailCodeService cmmnDetailCodeService;

	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;

	@RequestMapping("/cmmndetailcode/selectCmmnDetailCodeList.do")
	public String selectBoardArticles(CmmnDetailCodeVO vo, Model model) throws Exception {
		vo.setPageUnit(propertyService.getInt("pageUnit"));
		vo.setPageSize(propertyService.getInt("pageSize"));

		PaginationInfo paginationInfo = new PaginationInfo();

		paginationInfo.setCurrentPageNo(vo.getPageIndex());
		paginationInfo.setRecordCountPerPage(vo.getPageUnit());
		paginationInfo.setPageSize(vo.getPageSize());

		vo.setFirstIndex(paginationInfo.getFirstRecordIndex());
		vo.setLastIndex(paginationInfo.getLastRecordIndex());
		vo.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

		List<EgovMap> resultList = cmmnDetailCodeService.selectCmmnDetailCodeList(vo);
		int resultCnt = cmmnDetailCodeService.selectCmmnDetailCodeListCnt(vo);

		paginationInfo.setTotalRecordCount(resultCnt);

		model.addAttribute("resultList", resultList);
		model.addAttribute("resultCnt", resultCnt);
		model.addAttribute("paginationInfo", paginationInfo);

		return "god/com/cmmndetailcode/CmmnDetailCodeList";
	}

}
