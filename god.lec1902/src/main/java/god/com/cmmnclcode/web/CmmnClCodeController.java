package god.com.cmmnclcode.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.rte.psl.dataaccess.util.EgovMap;
import god.com.cmmnclcode.service.CmmnClCodeService;
import god.com.cmmnclcode.service.CmmnClCodeVO;

@Controller
public class CmmnClCodeController {

	@Resource(name = "CmmnClCodeService")
	private CmmnClCodeService cmmnClCodeService;

	@RequestMapping("/cmmnclcode/selectCmmnClCodeList.do")
	public String selectCmmnClCodeList(CmmnClCodeVO vo, Model model) throws Exception {

		List<EgovMap> results = cmmnClCodeService.selectCmmnClCodeList(vo);

		model.addAttribute("results", results);

		return "god/com/cmmnclcode/selectCmmnClCodeList";
	}

}
