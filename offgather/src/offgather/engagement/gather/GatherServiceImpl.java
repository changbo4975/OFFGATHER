package offgather.engagement.gather;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class GatherServiceImpl implements GatherService{
	@Resource
	private GatherMapper gatherMapper;
	
	//공개모임 목록 조회
	@Override
	public List<Map<String, Object>> publicGatherListInquiry(String name) {

		return null;
	}
}
