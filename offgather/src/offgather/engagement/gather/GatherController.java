package offgather.engagement.gather;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/gather")
public class GatherController {
	@Resource
	private GatherService GatherService;
	
	// 공개 모임 목록 조회
	@RequestMapping(value = "/publicList")
	public ModelAndView publicList(Gather gather) throws Exception {
		return new ModelAndView();
	}

	// 비공개 모임 목록 조회
	@RequestMapping(value = "/privateList")
	public ModelAndView privateList(Gather gather) throws Exception {
		return new ModelAndView();
	}

	// 공개 모임 조회
	@RequestMapping(value = "/publicRead")
	public ModelAndView publicRead(Gather gather) throws Exception {
		return new ModelAndView();
	}

	// 비공개 모임 조회
	@RequestMapping(value = "/privateRead")
	public ModelAndView privateRead(Gather gather) throws Exception {
		return new ModelAndView();
	}

	// 모임 등록 폼 //프로그램 목록서 수정(메소드이름)
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addGet(Gather gather) throws Exception {
		return new ModelAndView();
	}

	// 모임 등록 처리 //프로그램 목록서 수정(메소드이름)
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addPost(Gather gather) throws Exception {
		return new ModelAndView();
	}

	// 모임 수정 폼 //프로그램 목록서 수정(메소드 이름)
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateGet(Gather gather) throws Exception {
		return new ModelAndView();
	}

	// 모임 수정 처리 //프로그램 목록서 수정(메소드 이름)
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updatePost(Gather gather) throws Exception {
		return new ModelAndView();
	}

	// 모임 삭제
	@RequestMapping(value = "/delete")
	public ModelAndView delete(Gather gather) throws Exception {
		return new ModelAndView();
	}
}
